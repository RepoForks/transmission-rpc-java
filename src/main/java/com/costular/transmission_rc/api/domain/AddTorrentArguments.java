package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.http.command.BodyArguments;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by costular on 21/07/17.
 */
public class AddTorrentArguments extends BodyArguments {

    private String cookies;

    @SerializedName("download-dir")
    private String downloadDir;
    private String filename;
    private String metainfo;

    private boolean paused;

    @SerializedName("peer-limit")
    private long peerLimit;

    private long bandwidthPriority;

    @SerializedName("files-wanted")
    private List<String> filesWanted;

    @SerializedName("files-unwanted")
    private List<String> filesUnwanted;

    @SerializedName("priority-high")
    private List<String> priorityHigh;

    @SerializedName("priority-low")
    private List<String> priorityLow;

    @SerializedName("priority-normal")
    private List<String> priorityNormal;

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    public String getDownloadDir() {
        return downloadDir;
    }

    public void setDownloadDir(String downloadDir) {
        this.downloadDir = downloadDir;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getMetainfo() {
        return metainfo;
    }

    public void setMetainfo(String metainfo) {
        this.metainfo = metainfo;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public Long getPeerLimit() {
        return peerLimit;
    }

    public void setPeerLimit(Long peerLimit) {
        this.peerLimit = peerLimit;
    }

    public Long getBandwidthPriority() {
        return bandwidthPriority;
    }

    public void setBandwidthPriority(Long bandwidthPriority) {
        this.bandwidthPriority = bandwidthPriority;
    }

    public List<String> getFilesWanted() {
        return filesWanted;
    }

    public void setFilesWanted(List<String> filesWanted) {
        this.filesWanted = filesWanted;
    }

    public List<String> getFilesUnwanted() {
        return filesUnwanted;
    }

    public void setFilesUnwanted(List<String> filesUnwanted) {
        this.filesUnwanted = filesUnwanted;
    }

    public List<String> getPriorityHigh() {
        return priorityHigh;
    }

    public void setPriorityHigh(List<String> priorityHigh) {
        this.priorityHigh = priorityHigh;
    }

    public List<String> getPriorityLow() {
        return priorityLow;
    }

    public void setPriorityLow(List<String> priorityLow) {
        this.priorityLow = priorityLow;
    }

    public List<String> getPriorityNormal() {
        return priorityNormal;
    }

    public void setPriorityNormal(List<String> priorityNormal) {
        this.priorityNormal = priorityNormal;
    }

}
