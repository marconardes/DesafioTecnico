
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
    "fixedResolutionAndBitrateSettings"
})
public class PerTitleSettings {

    @JsonProperty("fixedResolutionAndBitrateSettings")
    private FixedResolutionAndBitrateSettings fixedResolutionAndBitrateSettings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fixedResolutionAndBitrateSettings")
    public FixedResolutionAndBitrateSettings getFixedResolutionAndBitrateSettings() {
        return fixedResolutionAndBitrateSettings;
    }

    @JsonProperty("fixedResolutionAndBitrateSettings")
    public void setFixedResolutionAndBitrateSettings(FixedResolutionAndBitrateSettings fixedResolutionAndBitrateSettings) {
        this.fixedResolutionAndBitrateSettings = fixedResolutionAndBitrateSettings;
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
