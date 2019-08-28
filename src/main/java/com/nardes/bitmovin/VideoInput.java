package com.nardes.bitmovin;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nardes.Configuration;
import com.nardes.configuration.Configurations;

public class VideoInput {
	
	


	public String postToCodec(String fileName)
	{
		Client client = ClientBuilder.newClient();
        client.register(HttpAuthenticationFeature.basic("x-api-key",Configuration.KEY ));
		WebTarget target = client.target(Configuration.APIURL+"/inputs/gcs");

		Codec c1 = new Codec();
		
		String json="";
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			json = objectMapper.writeValueAsString(c1);
			Response response = target.request().header("x-api-key",Configuration.KEY).post(Entity.json(json));
			
			System.out.println(response.getStatus());
		
			json = response.readEntity(String.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	
	
}
