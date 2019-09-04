
package com.nardes.bitmovin.json.streams.response;

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
    "minBitrate",
    "maxBitrate",
    "bitrateSelectionMode",
    "lowComplexityBoundaryForMaxBitrate",
    "highComplexityBoundaryForMaxBitrate"
})
public class FixedResolutionAndBitrateSettings {

    @JsonProperty("minBitrate")
    private Integer minBitrate;
    @JsonProperty("maxBitrate")
    private Integer maxBitrate;
    @JsonProperty("bitrateSelectionMode")
    private String bitrateSelectionMode;
    @JsonProperty("lowComplexityBoundaryForMaxBitrate")
    private Integer lowComplexityBoundaryForMaxBitrate;
    @JsonProperty("highComplexityBoundaryForMaxBitrate")
    private Integer highComplexityBoundaryForMaxBitrate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("minBitrate")
    public Integer getMinBitrate() {
        return minBitrate;
    }

    @JsonProperty("minBitrate")
    public void setMinBitrate(Integer minBitrate) {
        this.minBitrate = minBitrate;
    }

    @JsonProperty("maxBitrate")
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    @JsonProperty("maxBitrate")
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    @JsonProperty("bitrateSelectionMode")
    public String getBitrateSelectionMode() {
        return bitrateSelectionMode;
    }

    @JsonProperty("bitrateSelectionMode")
    public void setBitrateSelectionMode(String bitrateSelectionMode) {
        this.bitrateSelectionMode = bitrateSelectionMode;
    }

    @JsonProperty("lowComplexityBoundaryForMaxBitrate")
    public Integer getLowComplexityBoundaryForMaxBitrate() {
        return lowComplexityBoundaryForMaxBitrate;
    }

    @JsonProperty("lowComplexityBoundaryForMaxBitrate")
    public void setLowComplexityBoundaryForMaxBitrate(Integer lowComplexityBoundaryForMaxBitrate) {
        this.lowComplexityBoundaryForMaxBitrate = lowComplexityBoundaryForMaxBitrate;
    }

    @JsonProperty("highComplexityBoundaryForMaxBitrate")
    public Integer getHighComplexityBoundaryForMaxBitrate() {
        return highComplexityBoundaryForMaxBitrate;
    }

    @JsonProperty("highComplexityBoundaryForMaxBitrate")
    public void setHighComplexityBoundaryForMaxBitrate(Integer highComplexityBoundaryForMaxBitrate) {
        this.highComplexityBoundaryForMaxBitrate = highComplexityBoundaryForMaxBitrate;
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
