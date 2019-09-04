package com.nardes.bitmovin;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nardes.Configuration;

public class PostToBitmovin {

	public String postToCodec(String fileName)
	{
		Client client = ClientBuilder.newClient();
        client.register(HttpAuthenticationFeature.basic("x-api-key",Configuration.bitmovinKEY ));
		WebTarget target = client.target(Configuration.bitmovinAPIURL+"/inputs/gcs");

		Codec c1 = new Codec();
		
		String json="";
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			json = objectMapper.writeValueAsString(c1);
			Response response = target.request().header("x-api-key",Configuration.bitmovinKEY).post(Entity.json(json));
			
			System.out.println(response.getStatus());
		
			json = response.readEntity(String.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	
}
