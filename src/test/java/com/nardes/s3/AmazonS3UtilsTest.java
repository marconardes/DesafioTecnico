package com.nardes.s3;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Builder;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import io.findify.s3mock.S3Mock;

public class AmazonS3UtilsTest {

	
	@Before
	public void addFile()
	{
		
		
		AmazonS3Utils am3 = new AmazonS3Utils();
		String file = "/home/marco/Downloads/des.pdf";
		String filename="des.pdf";
		assertTrue(am3.addFile(file, filename));
		
	}

	@Test
	public void testContainsFileExist() {
		AmazonS3Utils am3 = new AmazonS3Utils();
		Boolean res = am3.containsFile("sample.mkv");
		assertTrue(res);
	}
	
	@Test
	public void testContainsFileNotExist() {
		
		AmazonS3Utils am3 = new AmazonS3Utils();
		Boolean res = am3.containsFile("null.mkv");
		
	}
	
	@Test
	public void testContainsUploadFile() {
		
		AmazonS3Utils am3 = new AmazonS3Utils();
		Boolean res = am3.containsFile("des.pdf");
		
	}
	
	@Test
	public void listUrl() {
		
		AmazonS3Utils am3 = new AmazonS3Utils();
		List<URL> res = am3.listUrl("sample.mkv");
		
		
		
	}
	
	@After
	public void removeFile()
	{
		AmazonS3Utils am3 = new AmazonS3Utils();
		String filename="des.pdf";
		assertFalse(am3.rmFile(filename));
	}
}
