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

public class VideoOutput {
	



	public String postToCodec(String fileName)
	{
		Client client = ClientBuilder.newClient();
        client.register(HttpAuthenticationFeature.basic("x-api-key",Configuration.KEY ));
		WebTarget target = client.target(Configuration.APIURL+"/inputs/gcs");

		Codec c1 = new Codec();
		c1.setName(fileName);
		c1.setDescription("Descrição do video");
		c1.setCustomData("string");
		c1.setBucketName("nardes-test");
		c1.setCloudRegion("AUTO");
		c1.setAccessKey(Configuration.ACESSKEY);
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
