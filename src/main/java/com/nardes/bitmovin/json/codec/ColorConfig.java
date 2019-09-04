
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
    "copyChromaLocationFlag",
    "copyColorSpaceFlag",
    "copyColorPrimariesFlag",
    "copyColorRangeFlag",
    "copyColorTransferFlag",
    "chromaLocation",
    "colorSpace",
    "colorPrimaries",
    "colorRange",
    "colorTransfer",
    "inputColorSpace",
    "inputColorRange"
})
public class ColorConfig {

    @JsonProperty("copyChromaLocationFlag")
    private Boolean copyChromaLocationFlag;
    @JsonProperty("copyColorSpaceFlag")
    private Boolean copyColorSpaceFlag;
    @JsonProperty("copyColorPrimariesFlag")
    private Boolean copyColorPrimariesFlag;
    @JsonProperty("copyColorRangeFlag")
    private Boolean copyColorRangeFlag;
    @JsonProperty("copyColorTransferFlag")
    private Boolean copyColorTransferFlag;
    @JsonProperty("chromaLocation")
    private String chromaLocation;
    @JsonProperty("colorSpace")
    private String colorSpace;
    @JsonProperty("colorPrimaries")
    private String colorPrimaries;
    @JsonProperty("colorRange")
    private String colorRange;
    @JsonProperty("colorTransfer")
    private String colorTransfer;
    @JsonProperty("inputColorSpace")
    private String inputColorSpace;
    @JsonProperty("inputColorRange")
    private String inputColorRange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("copyChromaLocationFlag")
    public Boolean getCopyChromaLocationFlag() {
        return copyChromaLocationFlag;
    }

    @JsonProperty("copyChromaLocationFlag")
    public void setCopyChromaLocationFlag(Boolean copyChromaLocationFlag) {
        this.copyChromaLocationFlag = copyChromaLocationFlag;
    }

    @JsonProperty("copyColorSpaceFlag")
    public Boolean getCopyColorSpaceFlag() {
        return copyColorSpaceFlag;
    }

    @JsonProperty("copyColorSpaceFlag")
    public void setCopyColorSpaceFlag(Boolean copyColorSpaceFlag) {
        this.copyColorSpaceFlag = copyColorSpaceFlag;
    }

    @JsonProperty("copyColorPrimariesFlag")
    public Boolean getCopyColorPrimariesFlag() {
        return copyColorPrimariesFlag;
    }

    @JsonProperty("copyColorPrimariesFlag")
    public void setCopyColorPrimariesFlag(Boolean copyColorPrimariesFlag) {
        this.copyColorPrimariesFlag = copyColorPrimariesFlag;
    }

    @JsonProperty("copyColorRangeFlag")
    public Boolean getCopyColorRangeFlag() {
        return copyColorRangeFlag;
    }

    @JsonProperty("copyColorRangeFlag")
    public void setCopyColorRangeFlag(Boolean copyColorRangeFlag) {
        this.copyColorRangeFlag = copyColorRangeFlag;
    }

    @JsonProperty("copyColorTransferFlag")
    public Boolean getCopyColorTransferFlag() {
        return copyColorTransferFlag;
    }

    @JsonProperty("copyColorTransferFlag")
    public void setCopyColorTransferFlag(Boolean copyColorTransferFlag) {
        this.copyColorTransferFlag = copyColorTransferFlag;
    }

    @JsonProperty("chromaLocation")
    public String getChromaLocation() {
        return chromaLocation;
    }

    @JsonProperty("chromaLocation")
    public void setChromaLocation(String chromaLocation) {
        this.chromaLocation = chromaLocation;
    }

    @JsonProperty("colorSpace")
    public String getColorSpace() {
        return colorSpace;
    }

    @JsonProperty("colorSpace")
    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    @JsonProperty("colorPrimaries")
    public String getColorPrimaries() {
        return colorPrimaries;
    }

    @JsonProperty("colorPrimaries")
    public void setColorPrimaries(String colorPrimaries) {
        this.colorPrimaries = colorPrimaries;
    }

    @JsonProperty("colorRange")
    public String getColorRange() {
        return colorRange;
    }

    @JsonProperty("colorRange")
    public void setColorRange(String colorRange) {
        this.colorRange = colorRange;
    }

    @JsonProperty("colorTransfer")
    public String getColorTransfer() {
        return colorTransfer;
    }

    @JsonProperty("colorTransfer")
    public void setColorTransfer(String colorTransfer) {
        this.colorTransfer = colorTransfer;
    }

    @JsonProperty("inputColorSpace")
    public String getInputColorSpace() {
        return inputColorSpace;
    }

    @JsonProperty("inputColorSpace")
    public void setInputColorSpace(String inputColorSpace) {
        this.inputColorSpace = inputColorSpace;
    }

    @JsonProperty("inputColorRange")
    public String getInputColorRange() {
        return inputColorRange;
    }

    @JsonProperty("inputColorRange")
    public void setInputColorRange(String inputColorRange) {
        this.inputColorRange = inputColorRange;
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
