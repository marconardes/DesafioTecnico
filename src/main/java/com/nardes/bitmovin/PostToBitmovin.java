package com.nardes.bitmovin;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nardes.Configuration;
import com.nardes.bitmovin.json.codec.CodecConfig;
import com.nardes.bitmovin.json.codec.CodecConfigResult;
import com.nardes.bitmovin.json.encoding.Encoding;
import com.nardes.bitmovin.json.encoding.EncodingResp;
import com.nardes.bitmovin.json.input.InputRequest;
import com.nardes.bitmovin.json.input.InputResult;


public class PostToBitmovin {

	Encoding enc;
	InputRequest inputRequest;
	CodecConfig config;
	
	
	public String postToApi(String apiRequest, String json)
	{
		Client client = ClientBuilder.newClient();
        client.register(HttpAuthenticationFeature.basic("x-api-key",Configuration.bitmovinKEY ));
		WebTarget target = client.target(Configuration.bitmovinAPIURL+apiRequest);
		
		Response response = target.request().header("x-api-key",Configuration.bitmovinKEY).post(Entity.json(json));
		
		System.out.println(response.getStatus());

		json = response.readEntity(String.class);
		return json;
	}
	
	public EncodingResp encodings()
	{
		String json=null;
		enc= new Encoding();
		String apiRequest = "/encoding/encodings";
		
		enc.setName("Encoding UI");
		enc.setCloudRegion("GOOGLE_EUROPE_WEST_1");
		enc.setEncoderVersion("2.22.0");
		String jsonRes="";
		EncodingResp resp = new EncodingResp();
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			json = objectMapper.writeValueAsString(enc);
			jsonRes = postToApi(apiRequest, json);	
			resp =  objectMapper.readValue(jsonRes,EncodingResp.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//String jsonRes = json;
		
		return resp;
	}
	
	private InputResult inputHTTP(String filename) {
		// TODO Auto-generated method stub
		String json=null;
		String apiRequest = "/encoding/inputs/https";
		String jsonRes = null;
		
		inputRequest = new InputRequest();
		inputRequest.setName(filename);
		inputRequest.setHost(Configuration.s3Host+"/"+Configuration.folderToConvert);
		
		InputResult resp = new InputResult();
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			json = objectMapper.writeValueAsString(inputRequest);
			jsonRes = postToApi(apiRequest, json);	
			resp =  objectMapper.readValue(jsonRes,InputResult.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resp;
	}
	
	private CodecConfigResult configVideoH264(String name, int bitrate, int width, String profile) {
		// TODO Auto-generated method stub
		String json=null;
		String apiRequest = "/encoding/configurations/video/h264";
		String jsonRes = null;
		
		config = new CodecConfig();
		config.setName(name);
		config.setBitrate(bitrate);
		config.setWidth(width);
		config.setProfile(profile);	
		
		CodecConfigResult resp = new CodecConfigResult();
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			json = objectMapper.writeValueAsString(config);
			jsonRes = postToApi(apiRequest, json);	
			resp =  objectMapper.readValue(jsonRes,CodecConfigResult.class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return resp;
	}

	
	
	public static void main(String[] args) {
		String fileName = "sample.mkv";
		PostToBitmovin toTest = new PostToBitmovin();
		EncodingResp respEnc = toTest.encodings();
		InputResult inputResult= toTest.inputHTTP(fileName);
		CodecConfigResult codecId = toTest.configVideoH264("Codec h264",1500000,1024,"HIGH");
		
		
	}


	
}