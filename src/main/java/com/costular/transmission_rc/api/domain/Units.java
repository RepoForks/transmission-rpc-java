package com.costular.transmission_rc.api.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by costular on 23/07/17.
 */
public class Units {

    @SerializedName("speed-units")
    private List<String> speedUnits;

    @SerializedName("speed-bytes")
    private long speedBytes;

    @SerializedName("size-units")
    private List<String> sizeUnits;

    @SerializedName("size-bytes")
    private long sizeBytes;

    @SerializedName("memory-units")
    private List<String> memoryUnits;

    @SerializedName("memory-bytes")
    private long memoryBytes;

}
