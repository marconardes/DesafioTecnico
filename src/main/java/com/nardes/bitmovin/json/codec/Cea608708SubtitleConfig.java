
package com.nardes.bitmovin.json.codec;

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
    "passthroughActivated"
})
public class Cea608708SubtitleConfig {

    @JsonProperty("passthroughActivated")
    private Boolean passthroughActivated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("passthroughActivated")
    public Boolean getPassthroughActivated() {
        return passthroughActivated;
    }

    @JsonProperty("passthroughActivated")
    public void setPassthroughActivated(Boolean passthroughActivated) {
        this.passthroughActivated = passthroughActivated;
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
