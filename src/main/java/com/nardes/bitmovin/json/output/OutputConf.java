
package com.nardes.bitmovin.json.output;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "bucketName",
    "accessKey",
    "secretKey"
})
public class OutputConf {

    @JsonProperty("name")
    private String name;
    @JsonProperty("bucketName")
    private String bucketName;
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

    @JsonProperty("bucketName")
    public String getBucketName() {
        return bucketName;
    }

    @JsonProperty("bucketName")
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
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
