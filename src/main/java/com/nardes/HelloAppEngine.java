package com.nardes;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

@WebServlet(name="HelloAppEngine", value="/hello")
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
	  
	  Storage storage = StorageOptions.getDefaultInstance().getService();
  	String bucketName = "nardes-test";
  	Bucket bucket= storage.create(BucketInfo.of(bucketName));
  	

    response.setContentType("text/plain");

		Page<Blob> blobs = bucket.list();
		for (Blob blob : blobs.iterateAll()) {
		  // do something with the blob
			
			response.getWriter().println(blob.getName());
		}
    
  }

  public static String getInfo() {
    return "Version: " + System.getProperty("java.version")
          + " OS: " + System.getProperty("os.name")
          + " User: " + System.getProperty("user.name");
  }
}
