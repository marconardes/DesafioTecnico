package com.nardes.bitmovin;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "description", "customData", "bucketName", "cloudRegion", "accessKey", "secretKey" })
public class Codec {

	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("customData")
	private String customData;
	@JsonProperty("bucketName")
	private String bucketName;
	@JsonProperty("cloudRegion")
	private String cloudRegion;
	@JsonProperty("accessKey")
	private String accessKey;
	@JsonProperty("secretKey")
	private String secretKey;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("customData")
	public String getCustomData() {
		return customData;
	}

	@JsonProperty("customData")
	public void setCustomData(String customData) {
		this.customData = customData;
	}

	@JsonProperty("bucketName")
	public String getBucketName() {
		return bucketName;
	}

	@JsonProperty("bucketName")
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	@JsonProperty("cloudRegion")
	public String getCloudRegion() {
		return cloudRegion;
	}

	@JsonProperty("cloudRegion")
	public void setCloudRegion(String cloudRegion) {
		this.cloudRegion = cloudRegion;
	}

	@JsonProperty("accessKey")
	public String getAccessKey() {
		return accessKey;
	}

	@JsonProperty("accessKey")
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	@JsonProperty("secretKey")
	public String getSecretKey() {
		return secretKey;
	}

	@JsonProperty("secretKey")
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}