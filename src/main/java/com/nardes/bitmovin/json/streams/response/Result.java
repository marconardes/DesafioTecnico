
package com.nardes.bitmovin.json.streams.response;

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
    "inputStreams",
    "outputs",
    "createQualityMetaData",
    "codecConfigId",
    "segmentsEncoded",
    "ignoredBy",
    "mode",
    "selectedEncodingMode",
    "perTitleSettings",
    "metadata",
    "decodingErrorMode",
    "appliedSettings"
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
    @JsonProperty("inputStreams")
    private List<InputStream> inputStreams = null;
    @JsonProperty("outputs")
    private List<Output> outputs = null;
    @JsonProperty("createQualityMetaData")
    private Boolean createQualityMetaData;
    @JsonProperty("codecConfigId")
    private String codecConfigId;
    @JsonProperty("segmentsEncoded")
    private Integer segmentsEncoded;
    @JsonProperty("ignoredBy")
    private List<IgnoredBy> ignoredBy = null;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("selectedEncodingMode")
    private String selectedEncodingMode;
    @JsonProperty("perTitleSettings")
    private PerTitleSettings perTitleSettings;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("decodingErrorMode")
    private String decodingErrorMode;
    @JsonProperty("appliedSettings")
    private AppliedSettings appliedSettings;
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

    @JsonProperty("inputStreams")
    public List<InputStream> getInputStreams() {
        return inputStreams;
    }

    @JsonProperty("inputStreams")
    public void setInputStreams(List<InputStream> inputStreams) {
        this.inputStreams = inputStreams;
    }

    @JsonProperty("outputs")
    public List<Output> getOutputs() {
        return outputs;
    }

    @JsonProperty("outputs")
    public void setOutputs(List<Output> outputs) {
        this.outputs = outputs;
    }

    @JsonProperty("createQualityMetaData")
    public Boolean getCreateQualityMetaData() {
        return createQualityMetaData;
    }

    @JsonProperty("createQualityMetaData")
    public void setCreateQualityMetaData(Boolean createQualityMetaData) {
        this.createQualityMetaData = createQualityMetaData;
    }

    @JsonProperty("codecConfigId")
    public String getCodecConfigId() {
        return codecConfigId;
    }

    @JsonProperty("codecConfigId")
    public void setCodecConfigId(String codecConfigId) {
        this.codecConfigId = codecConfigId;
    }

    @JsonProperty("segmentsEncoded")
    public Integer getSegmentsEncoded() {
        return segmentsEncoded;
    }

    @JsonProperty("segmentsEncoded")
    public void setSegmentsEncoded(Integer segmentsEncoded) {
        this.segmentsEncoded = segmentsEncoded;
    }

    @JsonProperty("ignoredBy")
    public List<IgnoredBy> getIgnoredBy() {
        return ignoredBy;
    }

    @JsonProperty("ignoredBy")
    public void setIgnoredBy(List<IgnoredBy> ignoredBy) {
        this.ignoredBy = ignoredBy;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    @JsonProperty("selectedEncodingMode")
    public String getSelectedEncodingMode() {
        return selectedEncodingMode;
    }

    @JsonProperty("selectedEncodingMode")
    public void setSelectedEncodingMode(String selectedEncodingMode) {
        this.selectedEncodingMode = selectedEncodingMode;
    }

    @JsonProperty("perTitleSettings")
    public PerTitleSettings getPerTitleSettings() {
        return perTitleSettings;
    }

    @JsonProperty("perTitleSettings")
    public void setPerTitleSettings(PerTitleSettings perTitleSettings) {
        this.perTitleSettings = perTitleSettings;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("decodingErrorMode")
    public String getDecodingErrorMode() {
        return decodingErrorMode;
    }

    @JsonProperty("decodingErrorMode")
    public void setDecodingErrorMode(String decodingErrorMode) {
        this.decodingErrorMode = decodingErrorMode;
    }

    @JsonProperty("appliedSettings")
    public AppliedSettings getAppliedSettings() {
        return appliedSettings;
    }

    @JsonProperty("appliedSettings")
    public void setAppliedSettings(AppliedSettings appliedSettings) {
        this.appliedSettings = appliedSettings;
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
