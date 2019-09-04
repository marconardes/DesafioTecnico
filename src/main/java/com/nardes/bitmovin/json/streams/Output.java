
package com.nardes.bitmovin.json.streams;

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
    "outputId",
    "outputPath",
    "acl"
})
public class Output {

    @JsonProperty("outputId")
    private String outputId;
    @JsonProperty("outputPath")
    private String outputPath;
    @JsonProperty("acl")
    private List<Acl> acl = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("outputId")
    public String getOutputId() {
        return outputId;
    }

    @JsonProperty("outputId")
    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    @JsonProperty("outputPath")
    public String getOutputPath() {
        return outputPath;
    }

    @JsonProperty("outputPath")
    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    @JsonProperty("acl")
    public List<Acl> getAcl() {
        return acl;
    }

    @JsonProperty("acl")
    public void setAcl(List<Acl> acl) {
        this.acl = acl;
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
