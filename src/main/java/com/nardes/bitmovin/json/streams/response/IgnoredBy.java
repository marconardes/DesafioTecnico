
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
    "ignoredBy",
    "ignoredByDescription"
})
public class IgnoredBy {

    @JsonProperty("ignoredBy")
    private String ignoredBy;
    @JsonProperty("ignoredByDescription")
    private String ignoredByDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ignoredBy")
    public String getIgnoredBy() {
        return ignoredBy;
    }

    @JsonProperty("ignoredBy")
    public void setIgnoredBy(String ignoredBy) {
        this.ignoredBy = ignoredBy;
    }

    @JsonProperty("ignoredByDescription")
    public String getIgnoredByDescription() {
        return ignoredByDescription;
    }

    @JsonProperty("ignoredByDescription")
    public void setIgnoredByDescription(String ignoredByDescription) {
        this.ignoredByDescription = ignoredByDescription;
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
