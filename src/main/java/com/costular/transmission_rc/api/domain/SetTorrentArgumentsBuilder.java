package com.costular.transmission_rc.api.domain;

import java.util.List;

public class SetTorrentArgumentsBuilder {
    private Integer bandwidthPriority;
    private Long downloadLimitInKBps;
    private Boolean downloadLimited;
    private List<Integer> filesToDownload;
    private List<Integer> filesToSkip;
    private Boolean honorsSessionLimits;
    private String location;
    private Integer peerLimit;
    private List<Integer> highPriorityFiles;
    private List<Integer> lowPriorityFiles;
    private List<Integer> normalPriorityFiles;
    private Integer queuePosition;
    private Integer seedIdleLimit;
    private Integer seedIdleMode;
    private Double seedRatioLimit;
    private Integer seedRatioMode;
    private List<String> trackersToAdd;
    private List<String> trackersToRemove;
    private List<String> trackersToReplace;
    private Long uploadLimitInKBps;
    private Boolean uploadLimited;

    public SetTorrentArgumentsBuilder setBandwidthPriority(Integer bandwidthPriority) {
        this.bandwidthPriority = bandwidthPriority;
        return this;
    }

    public SetTorrentArgumentsBuilder setDownloadLimitInKBps(Long downloadLimitInKBps) {
        this.downloadLimitInKBps = downloadLimitInKBps;
        return this;
    }

    public SetTorrentArgumentsBuilder setDownloadLimited(Boolean downloadLimited) {
        this.downloadLimited = downloadLimited;
        return this;
    }

    public SetTorrentArgumentsBuilder setFilesToDownload(List<Integer> filesToDownload) {
        this.filesToDownload = filesToDownload;
        return this;
    }

    public SetTorrentArgumentsBuilder setFilesToSkip(List<Integer> filesToSkip) {
        this.filesToSkip = filesToSkip;
        return this;
    }

    public SetTorrentArgumentsBuilder setHonorsSessionLimits(Boolean honorsSessionLimits) {
        this.honorsSessionLimits = honorsSessionLimits;
        return this;
    }

    public SetTorrentArgumentsBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public SetTorrentArgumentsBuilder setPeerLimit(Integer peerLimit) {
        this.peerLimit = peerLimit;
        return this;
    }

    public SetTorrentArgumentsBuilder setHighPriorityFiles(List<Integer> highPriorityFiles) {
        this.highPriorityFiles = highPriorityFiles;
        return this;
    }

    public SetTorrentArgumentsBuilder setLowPriorityFiles(List<Integer> lowPriorityFiles) {
        this.lowPriorityFiles = lowPriorityFiles;
        return this;
    }

    public SetTorrentArgumentsBuilder setNormalPriorityFiles(List<Integer> normalPriorityFiles) {
        this.normalPriorityFiles = normalPriorityFiles;
        return this;
    }

    public SetTorrentArgumentsBuilder setQueuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
        return this;
    }

    public SetTorrentArgumentsBuilder setSeedIdleLimit(Integer seedIdleLimit) {
        this.seedIdleLimit = seedIdleLimit;
        return this;
    }

    public SetTorrentArgumentsBuilder setSeedIdleMode(Integer seedIdleMode) {
        this.seedIdleMode = seedIdleMode;
        return this;
    }

    public SetTorrentArgumentsBuilder setSeedRatioLimit(Double seedRatioLimit) {
        this.seedRatioLimit = seedRatioLimit;
        return this;
    }

    public SetTorrentArgumentsBuilder setSeedRatioMode(Integer seedRatioMode) {
        this.seedRatioMode = seedRatioMode;
        return this;
    }

    public SetTorrentArgumentsBuilder setTrackersToAdd(List<String> trackersToAdd) {
        this.trackersToAdd = trackersToAdd;
        return this;
    }

    public SetTorrentArgumentsBuilder setTrackersToRemove(List<String> trackersToRemove) {
        this.trackersToRemove = trackersToRemove;
        return this;
    }

    public SetTorrentArgumentsBuilder setTrackersToReplace(List<String> trackersToReplace) {
        this.trackersToReplace = trackersToReplace;
        return this;
    }

    public SetTorrentArgumentsBuilder setUploadLimitInKBps(Long uploadLimitInKBps) {
        this.uploadLimitInKBps = uploadLimitInKBps;
        return this;
    }

    public SetTorrentArgumentsBuilder setUploadLimited(Boolean uploadLimited) {
        this.uploadLimited = uploadLimited;
        return this;
    }

    public SetTorrentArguments build() {
        return new SetTorrentArguments(bandwidthPriority, downloadLimitInKBps, downloadLimited, filesToDownload, filesToSkip, honorsSessionLimits, location, peerLimit, highPriorityFiles, lowPriorityFiles, normalPriorityFiles, queuePosition, seedIdleLimit, seedIdleMode, seedRatioLimit, seedRatioMode, trackersToAdd, trackersToRemove, trackersToReplace, uploadLimitInKBps, uploadLimited);
    }
}