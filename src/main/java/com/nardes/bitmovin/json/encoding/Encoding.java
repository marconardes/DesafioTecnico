
package com.nardes.bitmovin.json.encoding;

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
    "cloudRegion",
    "encoderVersion"
})
public class Encoding {

    @JsonProperty("name")
    private String name;
    @JsonProperty("cloudRegion")
    private String cloudRegion;
    @JsonProperty("encoderVersion")
    private String encoderVersion;
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

    @JsonProperty("cloudRegion")
    public String getCloudRegion() {
        return cloudRegion;
    }

    @JsonProperty("cloudRegion")
    public void setCloudRegion(String cloudRegion) {
        this.cloudRegion = cloudRegion;
    }

    @JsonProperty("encoderVersion")
    public String getEncoderVersion() {
        return encoderVersion;
    }

    @JsonProperty("encoderVersion")
    public void setEncoderVersion(String encoderVersion) {
        this.encoderVersion = encoderVersion;
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
