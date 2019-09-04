
package com.nardes.bitmovin.json.codec;

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
    "width",
    "height",
    "bitrate",
    "rate",
    "pixelFormat",
    "colorConfig",
    "sampleAspectRatioNumerator",
    "sampleAspectRatioDenominator",
    "encodingMode",
    "presetConfiguration",
    "crf",
    "profile",
    "bframes",
    "refFrames",
    "qpMin",
    "qpMax",
    "mvPredictionMode",
    "mvSearchRangeMax",
    "cabac",
    "maxBitrate",
    "minBitrate",
    "bufsize",
    "minGop",
    "maxGop",
    "openGop",
    "minKeyframeInterval",
    "maxKeyframeInterval",
    "level",
    "bAdaptiveStrategy",
    "motionEstimationMethod",
    "rcLookahead",
    "subMe",
    "trellis",
    "partitions",
    "slices",
    "interlaceMode",
    "sceneCutThreshold",
    "nalHrd",
    "bPyramid",
    "cea608708SubtitleConfig",
    "deblockAlpha",
    "deblockBeta",
    "adaptiveQuantizationMode",
    "adaptiveQuantizationStrength",
    "mixedReferences",
    "adaptiveSpatialTransform",
    "fastSkipDetectionPFrames",
    "weightedPredictionBFrames",
    "weightedPredictionPFrames",
    "macroblockTreeRatecontrol",
    "quantizerCurveCompression",
    "psyRateDistortionOptimization",
    "psyTrellis"
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
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("bitrate")
    private Integer bitrate;
    @JsonProperty("rate")
    private Double rate;
    @JsonProperty("pixelFormat")
    private String pixelFormat;
    @JsonProperty("colorConfig")
    private ColorConfig colorConfig;
    @JsonProperty("sampleAspectRatioNumerator")
    private Integer sampleAspectRatioNumerator;
    @JsonProperty("sampleAspectRatioDenominator")
    private Integer sampleAspectRatioDenominator;
    @JsonProperty("encodingMode")
    private String encodingMode;
    @JsonProperty("presetConfiguration")
    private String presetConfiguration;
    @JsonProperty("crf")
    private Integer crf;
    @JsonProperty("profile")
    private String profile;
    @JsonProperty("bframes")
    private Integer bframes;
    @JsonProperty("refFrames")
    private Integer refFrames;
    @JsonProperty("qpMin")
    private Integer qpMin;
    @JsonProperty("qpMax")
    private Integer qpMax;
    @JsonProperty("mvPredictionMode")
    private String mvPredictionMode;
    @JsonProperty("mvSearchRangeMax")
    private Integer mvSearchRangeMax;
    @JsonProperty("cabac")
    private Boolean cabac;
    @JsonProperty("maxBitrate")
    private Integer maxBitrate;
    @JsonProperty("minBitrate")
    private Integer minBitrate;
    @JsonProperty("bufsize")
    private Integer bufsize;
    @JsonProperty("minGop")
    private Integer minGop;
    @JsonProperty("maxGop")
    private Integer maxGop;
    @JsonProperty("openGop")
    private Boolean openGop;
    @JsonProperty("minKeyframeInterval")
    private Integer minKeyframeInterval;
    @JsonProperty("maxKeyframeInterval")
    private Integer maxKeyframeInterval;
    @JsonProperty("level")
    private String level;
    @JsonProperty("bAdaptiveStrategy")
    private String bAdaptiveStrategy;
    @JsonProperty("motionEstimationMethod")
    private String motionEstimationMethod;
    @JsonProperty("rcLookahead")
    private Integer rcLookahead;
    @JsonProperty("subMe")
    private String subMe;
    @JsonProperty("trellis")
    private String trellis;
    @JsonProperty("partitions")
    private List<String> partitions = null;
    @JsonProperty("slices")
    private Integer slices;
    @JsonProperty("interlaceMode")
    private String interlaceMode;
    @JsonProperty("sceneCutThreshold")
    private Integer sceneCutThreshold;
    @JsonProperty("nalHrd")
    private String nalHrd;
    @JsonProperty("bPyramid")
    private String bPyramid;
    @JsonProperty("cea608708SubtitleConfig")
    private Cea608708SubtitleConfig cea608708SubtitleConfig;
    @JsonProperty("deblockAlpha")
    private Integer deblockAlpha;
    @JsonProperty("deblockBeta")
    private Integer deblockBeta;
    @JsonProperty("adaptiveQuantizationMode")
    private String adaptiveQuantizationMode;
    @JsonProperty("adaptiveQuantizationStrength")
    private Integer adaptiveQuantizationStrength;
    @JsonProperty("mixedReferences")
    private Boolean mixedReferences;
    @JsonProperty("adaptiveSpatialTransform")
    private Boolean adaptiveSpatialTransform;
    @JsonProperty("fastSkipDetectionPFrames")
    private Boolean fastSkipDetectionPFrames;
    @JsonProperty("weightedPredictionBFrames")
    private Boolean weightedPredictionBFrames;
    @JsonProperty("weightedPredictionPFrames")
    private String weightedPredictionPFrames;
    @JsonProperty("macroblockTreeRatecontrol")
    private Boolean macroblockTreeRatecontrol;
    @JsonProperty("quantizerCurveCompression")
    private Double quantizerCurveCompression;
    @JsonProperty("psyRateDistortionOptimization")
    private Integer psyRateDistortionOptimization;
    @JsonProperty("psyTrellis")
    private Integer psyTrellis;
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

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("bitrate")
    public Integer getBitrate() {
        return bitrate;
    }

    @JsonProperty("bitrate")
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    @JsonProperty("pixelFormat")
    public String getPixelFormat() {
        return pixelFormat;
    }

    @JsonProperty("pixelFormat")
    public void setPixelFormat(String pixelFormat) {
        this.pixelFormat = pixelFormat;
    }

    @JsonProperty("colorConfig")
    public ColorConfig getColorConfig() {
        return colorConfig;
    }

    @JsonProperty("colorConfig")
    public void setColorConfig(ColorConfig colorConfig) {
        this.colorConfig = colorConfig;
    }

    @JsonProperty("sampleAspectRatioNumerator")
    public Integer getSampleAspectRatioNumerator() {
        return sampleAspectRatioNumerator;
    }

    @JsonProperty("sampleAspectRatioNumerator")
    public void setSampleAspectRatioNumerator(Integer sampleAspectRatioNumerator) {
        this.sampleAspectRatioNumerator = sampleAspectRatioNumerator;
    }

    @JsonProperty("sampleAspectRatioDenominator")
    public Integer getSampleAspectRatioDenominator() {
        return sampleAspectRatioDenominator;
    }

    @JsonProperty("sampleAspectRatioDenominator")
    public void setSampleAspectRatioDenominator(Integer sampleAspectRatioDenominator) {
        this.sampleAspectRatioDenominator = sampleAspectRatioDenominator;
    }

    @JsonProperty("encodingMode")
    public String getEncodingMode() {
        return encodingMode;
    }

    @JsonProperty("encodingMode")
    public void setEncodingMode(String encodingMode) {
        this.encodingMode = encodingMode;
    }

    @JsonProperty("presetConfiguration")
    public String getPresetConfiguration() {
        return presetConfiguration;
    }

    @JsonProperty("presetConfiguration")
    public void setPresetConfiguration(String presetConfiguration) {
        this.presetConfiguration = presetConfiguration;
    }

    @JsonProperty("crf")
    public Integer getCrf() {
        return crf;
    }

    @JsonProperty("crf")
    public void setCrf(Integer crf) {
        this.crf = crf;
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

    @JsonProperty("qpMin")
    public Integer getQpMin() {
        return qpMin;
    }

    @JsonProperty("qpMin")
    public void setQpMin(Integer qpMin) {
        this.qpMin = qpMin;
    }

    @JsonProperty("qpMax")
    public Integer getQpMax() {
        return qpMax;
    }

    @JsonProperty("qpMax")
    public void setQpMax(Integer qpMax) {
        this.qpMax = qpMax;
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

    @JsonProperty("maxBitrate")
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    @JsonProperty("maxBitrate")
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    @JsonProperty("minBitrate")
    public Integer getMinBitrate() {
        return minBitrate;
    }

    @JsonProperty("minBitrate")
    public void setMinBitrate(Integer minBitrate) {
        this.minBitrate = minBitrate;
    }

    @JsonProperty("bufsize")
    public Integer getBufsize() {
        return bufsize;
    }

    @JsonProperty("bufsize")
    public void setBufsize(Integer bufsize) {
        this.bufsize = bufsize;
    }

    @JsonProperty("minGop")
    public Integer getMinGop() {
        return minGop;
    }

    @JsonProperty("minGop")
    public void setMinGop(Integer minGop) {
        this.minGop = minGop;
    }

    @JsonProperty("maxGop")
    public Integer getMaxGop() {
        return maxGop;
    }

    @JsonProperty("maxGop")
    public void setMaxGop(Integer maxGop) {
        this.maxGop = maxGop;
    }

    @JsonProperty("openGop")
    public Boolean getOpenGop() {
        return openGop;
    }

    @JsonProperty("openGop")
    public void setOpenGop(Boolean openGop) {
        this.openGop = openGop;
    }

    @JsonProperty("minKeyframeInterval")
    public Integer getMinKeyframeInterval() {
        return minKeyframeInterval;
    }

    @JsonProperty("minKeyframeInterval")
    public void setMinKeyframeInterval(Integer minKeyframeInterval) {
        this.minKeyframeInterval = minKeyframeInterval;
    }

    @JsonProperty("maxKeyframeInterval")
    public Integer getMaxKeyframeInterval() {
        return maxKeyframeInterval;
    }

    @JsonProperty("maxKeyframeInterval")
    public void setMaxKeyframeInterval(Integer maxKeyframeInterval) {
        this.maxKeyframeInterval = maxKeyframeInterval;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
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

    @JsonProperty("trellis")
    public String getTrellis() {
        return trellis;
    }

    @JsonProperty("trellis")
    public void setTrellis(String trellis) {
        this.trellis = trellis;
    }

    @JsonProperty("partitions")
    public List<String> getPartitions() {
        return partitions;
    }

    @JsonProperty("partitions")
    public void setPartitions(List<String> partitions) {
        this.partitions = partitions;
    }

    @JsonProperty("slices")
    public Integer getSlices() {
        return slices;
    }

    @JsonProperty("slices")
    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    @JsonProperty("interlaceMode")
    public String getInterlaceMode() {
        return interlaceMode;
    }

    @JsonProperty("interlaceMode")
    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    @JsonProperty("sceneCutThreshold")
    public Integer getSceneCutThreshold() {
        return sceneCutThreshold;
    }

    @JsonProperty("sceneCutThreshold")
    public void setSceneCutThreshold(Integer sceneCutThreshold) {
        this.sceneCutThreshold = sceneCutThreshold;
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

    @JsonProperty("cea608708SubtitleConfig")
    public Cea608708SubtitleConfig getCea608708SubtitleConfig() {
        return cea608708SubtitleConfig;
    }

    @JsonProperty("cea608708SubtitleConfig")
    public void setCea608708SubtitleConfig(Cea608708SubtitleConfig cea608708SubtitleConfig) {
        this.cea608708SubtitleConfig = cea608708SubtitleConfig;
    }

    @JsonProperty("deblockAlpha")
    public Integer getDeblockAlpha() {
        return deblockAlpha;
    }

    @JsonProperty("deblockAlpha")
    public void setDeblockAlpha(Integer deblockAlpha) {
        this.deblockAlpha = deblockAlpha;
    }

    @JsonProperty("deblockBeta")
    public Integer getDeblockBeta() {
        return deblockBeta;
    }

    @JsonProperty("deblockBeta")
    public void setDeblockBeta(Integer deblockBeta) {
        this.deblockBeta = deblockBeta;
    }

    @JsonProperty("adaptiveQuantizationMode")
    public String getAdaptiveQuantizationMode() {
        return adaptiveQuantizationMode;
    }

    @JsonProperty("adaptiveQuantizationMode")
    public void setAdaptiveQuantizationMode(String adaptiveQuantizationMode) {
        this.adaptiveQuantizationMode = adaptiveQuantizationMode;
    }

    @JsonProperty("adaptiveQuantizationStrength")
    public Integer getAdaptiveQuantizationStrength() {
        return adaptiveQuantizationStrength;
    }

    @JsonProperty("adaptiveQuantizationStrength")
    public void setAdaptiveQuantizationStrength(Integer adaptiveQuantizationStrength) {
        this.adaptiveQuantizationStrength = adaptiveQuantizationStrength;
    }

    @JsonProperty("mixedReferences")
    public Boolean getMixedReferences() {
        return mixedReferences;
    }

    @JsonProperty("mixedReferences")
    public void setMixedReferences(Boolean mixedReferences) {
        this.mixedReferences = mixedReferences;
    }

    @JsonProperty("adaptiveSpatialTransform")
    public Boolean getAdaptiveSpatialTransform() {
        return adaptiveSpatialTransform;
    }

    @JsonProperty("adaptiveSpatialTransform")
    public void setAdaptiveSpatialTransform(Boolean adaptiveSpatialTransform) {
        this.adaptiveSpatialTransform = adaptiveSpatialTransform;
    }

    @JsonProperty("fastSkipDetectionPFrames")
    public Boolean getFastSkipDetectionPFrames() {
        return fastSkipDetectionPFrames;
    }

    @JsonProperty("fastSkipDetectionPFrames")
    public void setFastSkipDetectionPFrames(Boolean fastSkipDetectionPFrames) {
        this.fastSkipDetectionPFrames = fastSkipDetectionPFrames;
    }

    @JsonProperty("weightedPredictionBFrames")
    public Boolean getWeightedPredictionBFrames() {
        return weightedPredictionBFrames;
    }

    @JsonProperty("weightedPredictionBFrames")
    public void setWeightedPredictionBFrames(Boolean weightedPredictionBFrames) {
        this.weightedPredictionBFrames = weightedPredictionBFrames;
    }

    @JsonProperty("weightedPredictionPFrames")
    public String getWeightedPredictionPFrames() {
        return weightedPredictionPFrames;
    }

    @JsonProperty("weightedPredictionPFrames")
    public void setWeightedPredictionPFrames(String weightedPredictionPFrames) {
        this.weightedPredictionPFrames = weightedPredictionPFrames;
    }

    @JsonProperty("macroblockTreeRatecontrol")
    public Boolean getMacroblockTreeRatecontrol() {
        return macroblockTreeRatecontrol;
    }

    @JsonProperty("macroblockTreeRatecontrol")
    public void setMacroblockTreeRatecontrol(Boolean macroblockTreeRatecontrol) {
        this.macroblockTreeRatecontrol = macroblockTreeRatecontrol;
    }

    @JsonProperty("quantizerCurveCompression")
    public Double getQuantizerCurveCompression() {
        return quantizerCurveCompression;
    }

    @JsonProperty("quantizerCurveCompression")
    public void setQuantizerCurveCompression(Double quantizerCurveCompression) {
        this.quantizerCurveCompression = quantizerCurveCompression;
    }

    @JsonProperty("psyRateDistortionOptimization")
    public Integer getPsyRateDistortionOptimization() {
        return psyRateDistortionOptimization;
    }

    @JsonProperty("psyRateDistortionOptimization")
    public void setPsyRateDistortionOptimization(Integer psyRateDistortionOptimization) {
        this.psyRateDistortionOptimization = psyRateDistortionOptimization;
    }

    @JsonProperty("psyTrellis")
    public Integer getPsyTrellis() {
        return psyTrellis;
    }

    @JsonProperty("psyTrellis")
    public void setPsyTrellis(Integer psyTrellis) {
        this.psyTrellis = psyTrellis;
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
