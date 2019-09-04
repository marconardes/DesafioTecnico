
package com.nardes.bitmovin.json.streams;

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
    "inputId",
    "inputPath",
    "selectionMode"
})
public class InputStream {

    @JsonProperty("inputId")
    private String inputId;
    @JsonProperty("inputPath")
    private String inputPath;
    @JsonProperty("selectionMode")
    private String selectionMode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inputId")
    public String getInputId() {
        return inputId;
    }

    @JsonProperty("inputId")
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    @JsonProperty("inputPath")
    public String getInputPath() {
        return inputPath;
    }

    @JsonProperty("inputPath")
    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    @JsonProperty("selectionMode")
    public String getSelectionMode() {
        return selectionMode;
    }

    @JsonProperty("selectionMode")
    public void setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
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
