package com.nardes.s3;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.nardes.Configuration;


public class AmazonS3Utils {

	BasicAWSCredentials cred;
	 AmazonS3 interopClient;
    
	public AmazonS3Utils() {
		// TODO Auto-generated constructor stub
		this.cred = new BasicAWSCredentials(Configuration.AWSAccessKeyId,
	    		Configuration.AWSSecretKey);
		this.interopClient = AmazonS3ClientBuilder.standard()
	    		.withCredentials(new AWSStaticCredentialsProvider(cred))
	    		.withRegion(Regions.US_EAST_2)
	    		.build();
	}
	
	public List<S3ObjectSummary> listFiles(){
				
	    ObjectListing listing = interopClient.listObjects( "nardestest" );
	    List<S3ObjectSummary> summaries = listing.getObjectSummaries();
	    
	    while (listing.isTruncated()) {
	       listing = interopClient.listNextBatchOfObjects (listing);
	       
	       summaries.addAll (listing.getObjectSummaries());
	    }
	    
		return summaries;
    }
	
	public boolean containsFile(String file)
	{
		List<S3ObjectSummary> sumaries = listFiles();
		String res="";
		for (S3ObjectSummary s3ObjectSummary : sumaries) {
			
			if(s3ObjectSummary.getKey().equals(file))
			{
				return true;				
			}
		}
		return false;
	}

	public boolean addFile(String file, String filename) {
		// TODO Auto-generated method stub
		
		PutObjectRequest request = new PutObjectRequest("nardestest",filename,new File(file));
		ObjectMetadata metadata = new ObjectMetadata();
		request.setMetadata(metadata);
		
	    AccessControlList acl = new AccessControlList();
	    acl.grantPermission(GroupGrantee.AllUsers, Permission.Read); //all users or authenticated
	    request.setAccessControlList(acl);
		
		
		interopClient.putObject(request);
		
		
		
		
		return containsFile(filename);
		
	}

	public boolean rmFile(String filename) {
		// TODO Auto-generated method stub
		
		interopClient.deleteObject(new DeleteObjectRequest("nardestest", filename));
		return containsFile(filename);
	}
	
	public List<URL> listUrl(String filename)
	{
		List<S3ObjectSummary> sumaries = listFiles();
		List<URL> res= new ArrayList<URL>();
		for (S3ObjectSummary s3ObjectSummary : sumaries) {
			if(s3ObjectSummary.getKey().equals(filename))
			{
				URL url = interopClient.getUrl("nardestest", s3ObjectSummary.getKey());
				System.out.println(url.toString());
				res.add(url);
			}
			
		}
		return res;
	}
}	
