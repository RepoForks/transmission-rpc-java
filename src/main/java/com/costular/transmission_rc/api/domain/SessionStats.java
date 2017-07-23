package com.costular.transmission_rc.api.domain;

import com.google.gson.annotations.SerializedName;

public class SessionStats {

    private long activeTorrentCount;
    private long downloadSpeed;
    private long pausedTorrentCount;
    private long torrentCount;
    private long uploadSpeed;

    @SerializedName("cumulative-stats")
    private CumulativeStats cumulativeStats;

    @SerializedName("current-stats")
    private CurrentStats currentStats;

    public SessionStats() {
    }

    public SessionStats(long activeTorrentCount, long downloadSpeed, long pausedTorrentCount, long torrentCount, long uploadSpeed, CumulativeStats cumulativeStats, CurrentStats currentStats) {
        this.activeTorrentCount = activeTorrentCount;
        this.downloadSpeed = downloadSpeed;
        this.pausedTorrentCount = pausedTorrentCount;
        this.torrentCount = torrentCount;
        this.uploadSpeed = uploadSpeed;
        this.cumulativeStats = cumulativeStats;
        this.currentStats = currentStats;
    }

    public long getActiveTorrentCount() {
        return activeTorrentCount;
    }

    public void setActiveTorrentCount(long activeTorrentCount) {
        this.activeTorrentCount = activeTorrentCount;
    }

    public long getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(long downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public long getPausedTorrentCount() {
        return pausedTorrentCount;
    }

    public void setPausedTorrentCount(long pausedTorrentCount) {
        this.pausedTorrentCount = pausedTorrentCount;
    }

    public long getTorrentCount() {
        return torrentCount;
    }

    public void setTorrentCount(long torrentCount) {
        this.torrentCount = torrentCount;
    }

    public long getUploadSpeed() {
        return uploadSpeed;
    }

    public void setUploadSpeed(long uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    public CumulativeStats getCumulativeStats() {
        return cumulativeStats;
    }

    public void setCumulativeStats(CumulativeStats cumulativeStats) {
        this.cumulativeStats = cumulativeStats;
    }

    public CurrentStats getCurrentStats() {
        return currentStats;
    }

    public void setCurrentStats(CurrentStats currentStats) {
        this.currentStats = currentStats;
    }
}
