
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
    "id",
    "name",
    "encoderVersion",
    "createdAt",
    "modifiedAt",
    "cloudRegion",
    "selectedCloudRegion",
    "type",
    "status",
    "progress"
})
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("encoderVersion")
    private String encoderVersion;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("cloudRegion")
    private String cloudRegion;
    @JsonProperty("selectedCloudRegion")
    private String selectedCloudRegion;
    @JsonProperty("type")
    private String type;
    @JsonProperty("status")
    private String status;
    @JsonProperty("progress")
    private Integer progress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("encoderVersion")
    public String getEncoderVersion() {
        return encoderVersion;
    }

    @JsonProperty("encoderVersion")
    public void setEncoderVersion(String encoderVersion) {
        this.encoderVersion = encoderVersion;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("modifiedAt")
    public String getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("modifiedAt")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @JsonProperty("cloudRegion")
    public String getCloudRegion() {
        return cloudRegion;
    }

    @JsonProperty("cloudRegion")
    public void setCloudRegion(String cloudRegion) {
        this.cloudRegion = cloudRegion;
    }

    @JsonProperty("selectedCloudRegion")
    public String getSelectedCloudRegion() {
        return selectedCloudRegion;
    }

    @JsonProperty("selectedCloudRegion")
    public void setSelectedCloudRegion(String selectedCloudRegion) {
        this.selectedCloudRegion = selectedCloudRegion;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("progress")
    public Integer getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Integer progress) {
        this.progress = progress;
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
