
package com.nardes.bitmovin.json.output;

import java.util.HashMap;
import java.util.List;
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
    "description",
    "createdAt",
    "modifiedAt",
    "acl",
    "bucketName",
    "md5MetaTag",
    "cloudRegion",
    "signatureVersion"
})
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("acl")
    private List<Acl> acl = null;
    @JsonProperty("bucketName")
    private String bucketName;
    @JsonProperty("md5MetaTag")
    private String md5MetaTag;
    @JsonProperty("cloudRegion")
    private String cloudRegion;
    @JsonProperty("signatureVersion")
    private String signatureVersion;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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

    @JsonProperty("acl")
    public List<Acl> getAcl() {
        return acl;
    }

    @JsonProperty("acl")
    public void setAcl(List<Acl> acl) {
        this.acl = acl;
    }

    @JsonProperty("bucketName")
    public String getBucketName() {
        return bucketName;
    }

    @JsonProperty("bucketName")
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @JsonProperty("md5MetaTag")
    public String getMd5MetaTag() {
        return md5MetaTag;
    }

    @JsonProperty("md5MetaTag")
    public void setMd5MetaTag(String md5MetaTag) {
        this.md5MetaTag = md5MetaTag;
    }

    @JsonProperty("cloudRegion")
    public String getCloudRegion() {
        return cloudRegion;
    }

    @JsonProperty("cloudRegion")
    public void setCloudRegion(String cloudRegion) {
        this.cloudRegion = cloudRegion;
    }

    @JsonProperty("signatureVersion")
    public String getSignatureVersion() {
        return signatureVersion;
    }

    @JsonProperty("signatureVersion")
    public void setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
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
