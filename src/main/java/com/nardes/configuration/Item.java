
package com.nardes.configuration;

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
    "preset",
    "name",
    "createdAt",
    "modifiedAt",
    "type",
    "bitrate",
    "width",
    "profile",
    "bframes",
    "refFrames",
    "mvPredictionMode",
    "mvSearchRangeMax",
    "cabac",
    "bAdaptiveStrategy",
    "motionEstimationMethod",
    "rcLookahead",
    "subMe",
    "partitions",
    "trellis",
    "nalHrd",
    "bPyramid",
    "bAdapt",
    "maxCTUSize",
    "tuIntraDepth",
    "tuInterDepth",
    "motionSearch",
    "motionSearchRange",
    "weightPredictionOnPSlice",
    "weightPredictionOnBSlice",
    "sao"
})
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("preset")
    private String preset;
    @JsonProperty("name")
    private String name;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("modifiedAt")
    private String modifiedAt;
    @JsonProperty("type")
    private String type;
    @JsonProperty("bitrate")
    private Integer bitrate;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("profile")
    private String profile;
    @JsonProperty("bframes")
    private Integer bframes;
    @JsonProperty("refFrames")
    private Integer refFrames;
    @JsonProperty("mvPredictionMode")
    private String mvPredictionMode;
    @JsonProperty("mvSearchRangeMax")
    private Integer mvSearchRangeMax;
    @JsonProperty("cabac")
    private Boolean cabac;
    @JsonProperty("bAdaptiveStrategy")
    private String bAdaptiveStrategy;
    @JsonProperty("motionEstimationMethod")
    private String motionEstimationMethod;
    @JsonProperty("rcLookahead")
    private Integer rcLookahead;
    @JsonProperty("subMe")
    private String subMe;
    @JsonProperty("partitions")
    private List<String> partitions = null;
    @JsonProperty("trellis")
    private String trellis;
    @JsonProperty("nalHrd")
    private String nalHrd;
    @JsonProperty("bPyramid")
    private String bPyramid;
    @JsonProperty("bAdapt")
    private String bAdapt;
    @JsonProperty("maxCTUSize")
    private String maxCTUSize;
    @JsonProperty("tuIntraDepth")
    private String tuIntraDepth;
    @JsonProperty("tuInterDepth")
    private String tuInterDepth;
    @JsonProperty("motionSearch")
    private String motionSearch;
    @JsonProperty("motionSearchRange")
    private Integer motionSearchRange;
    @JsonProperty("weightPredictionOnPSlice")
    private Boolean weightPredictionOnPSlice;
    @JsonProperty("weightPredictionOnBSlice")
    private Boolean weightPredictionOnBSlice;
    @JsonProperty("sao")
    private Boolean sao;
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

    @JsonProperty("preset")
    public String getPreset() {
        return preset;
    }

    @JsonProperty("preset")
    public void setPreset(String preset) {
        this.preset = preset;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("bitrate")
    public Integer getBitrate() {
        return bitrate;
    }

    @JsonProperty("bitrate")
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @JsonProperty("bframes")
    public Integer getBframes() {
        return bframes;
    }

    @JsonProperty("bframes")
    public void setBframes(Integer bframes) {
        this.bframes = bframes;
    }

    @JsonProperty("refFrames")
    public Integer getRefFrames() {
        return refFrames;
    }

    @JsonProperty("refFrames")
    public void setRefFrames(Integer refFrames) {
        this.refFrames = refFrames;
    }

    @JsonProperty("mvPredictionMode")
    public String getMvPredictionMode() {
        return mvPredictionMode;
    }

    @JsonProperty("mvPredictionMode")
    public void setMvPredictionMode(String mvPredictionMode) {
        this.mvPredictionMode = mvPredictionMode;
    }

    @JsonProperty("mvSearchRangeMax")
    public Integer getMvSearchRangeMax() {
        return mvSearchRangeMax;
    }

    @JsonProperty("mvSearchRangeMax")
    public void setMvSearchRangeMax(Integer mvSearchRangeMax) {
        this.mvSearchRangeMax = mvSearchRangeMax;
    }

    @JsonProperty("cabac")
    public Boolean getCabac() {
        return cabac;
    }

    @JsonProperty("cabac")
    public void setCabac(Boolean cabac) {
        this.cabac = cabac;
    }

    @JsonProperty("bAdaptiveStrategy")
    public String getBAdaptiveStrategy() {
        return bAdaptiveStrategy;
    }

    @JsonProperty("bAdaptiveStrategy")
    public void setBAdaptiveStrategy(String bAdaptiveStrategy) {
        this.bAdaptiveStrategy = bAdaptiveStrategy;
    }

    @JsonProperty("motionEstimationMethod")
    public String getMotionEstimationMethod() {
        return motionEstimationMethod;
    }

    @JsonProperty("motionEstimationMethod")
    public void setMotionEstimationMethod(String motionEstimationMethod) {
        this.motionEstimationMethod = motionEstimationMethod;
    }

    @JsonProperty("rcLookahead")
    public Integer getRcLookahead() {
        return rcLookahead;
    }

    @JsonProperty("rcLookahead")
    public void setRcLookahead(Integer rcLookahead) {
        this.rcLookahead = rcLookahead;
    }

    @JsonProperty("subMe")
    public String getSubMe() {
        return subMe;
    }

    @JsonProperty("subMe")
    public void setSubMe(String subMe) {
        this.subMe = subMe;
    }

    @JsonProperty("partitions")
    public List<String> getPartitions() {
        return partitions;
    }

    @JsonProperty("partitions")
    public void setPartitions(List<String> partitions) {
        this.partitions = partitions;
    }

    @JsonProperty("trellis")
    public String getTrellis() {
        return trellis;
    }

    @JsonProperty("trellis")
    public void setTrellis(String trellis) {
        this.trellis = trellis;
    }

    @JsonProperty("nalHrd")
    public String getNalHrd() {
        return nalHrd;
    }

    @JsonProperty("nalHrd")
    public void setNalHrd(String nalHrd) {
        this.nalHrd = nalHrd;
    }

    @JsonProperty("bPyramid")
    public String getBPyramid() {
        return bPyramid;
    }

    @JsonProperty("bPyramid")
    public void setBPyramid(String bPyramid) {
        this.bPyramid = bPyramid;
    }

    @JsonProperty("bAdapt")
    public String getBAdapt() {
        return bAdapt;
    }

    @JsonProperty("bAdapt")
    public void setBAdapt(String bAdapt) {
        this.bAdapt = bAdapt;
    }

    @JsonProperty("maxCTUSize")
    public String getMaxCTUSize() {
        return maxCTUSize;
    }

    @JsonProperty("maxCTUSize")
    public void setMaxCTUSize(String maxCTUSize) {
        this.maxCTUSize = maxCTUSize;
    }

    @JsonProperty("tuIntraDepth")
    public String getTuIntraDepth() {
        return tuIntraDepth;
    }

    @JsonProperty("tuIntraDepth")
    public void setTuIntraDepth(String tuIntraDepth) {
        this.tuIntraDepth = tuIntraDepth;
    }

    @JsonProperty("tuInterDepth")
    public String getTuInterDepth() {
        return tuInterDepth;
    }

    @JsonProperty("tuInterDepth")
    public void setTuInterDepth(String tuInterDepth) {
        this.tuInterDepth = tuInterDepth;
    }

    @JsonProperty("motionSearch")
    public String getMotionSearch() {
        return motionSearch;
    }

    @JsonProperty("motionSearch")
    public void setMotionSearch(String motionSearch) {
        this.motionSearch = motionSearch;
    }

    @JsonProperty("motionSearchRange")
    public Integer getMotionSearchRange() {
        return motionSearchRange;
    }

    @JsonProperty("motionSearchRange")
    public void setMotionSearchRange(Integer motionSearchRange) {
        this.motionSearchRange = motionSearchRange;
    }

    @JsonProperty("weightPredictionOnPSlice")
    public Boolean getWeightPredictionOnPSlice() {
        return weightPredictionOnPSlice;
    }

    @JsonProperty("weightPredictionOnPSlice")
    public void setWeightPredictionOnPSlice(Boolean weightPredictionOnPSlice) {
        this.weightPredictionOnPSlice = weightPredictionOnPSlice;
    }

    @JsonProperty("weightPredictionOnBSlice")
    public Boolean getWeightPredictionOnBSlice() {
        return weightPredictionOnBSlice;
    }

    @JsonProperty("weightPredictionOnBSlice")
    public void setWeightPredictionOnBSlice(Boolean weightPredictionOnBSlice) {
        this.weightPredictionOnBSlice = weightPredictionOnBSlice;
    }

    @JsonProperty("sao")
    public Boolean getSao() {
        return sao;
    }

    @JsonProperty("sao")
    public void setSao(Boolean sao) {
        this.sao = sao;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Item [id=" + id + ", preset=" + preset + ", name=" + name + ", createdAt=" + createdAt + ", modifiedAt="
				+ modifiedAt + ", type=" + type + ", bitrate=" + bitrate + ", width=" + width + ", profile=" + profile
				+ ", bframes=" + bframes + ", refFrames=" + refFrames + ", mvPredictionMode=" + mvPredictionMode
				+ ", mvSearchRangeMax=" + mvSearchRangeMax + ", cabac=" + cabac + ", bAdaptiveStrategy="
				+ bAdaptiveStrategy + ", motionEstimationMethod=" + motionEstimationMethod + ", rcLookahead="
				+ rcLookahead + ", subMe=" + subMe + ", partitions=" + partitions + ", trellis=" + trellis + ", nalHrd="
				+ nalHrd + ", bPyramid=" + bPyramid + ", bAdapt=" + bAdapt + ", maxCTUSize=" + maxCTUSize
				+ ", tuIntraDepth=" + tuIntraDepth + ", tuInterDepth=" + tuInterDepth + ", motionSearch=" + motionSearch
				+ ", motionSearchRange=" + motionSearchRange + ", weightPredictionOnPSlice=" + weightPredictionOnPSlice
				+ ", weightPredictionOnBSlice=" + weightPredictionOnBSlice + ", sao=" + sao + ", additionalProperties="
				+ additionalProperties + "]";
	}

    
}
