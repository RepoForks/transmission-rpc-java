package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.http.command.BodyArguments;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class SetTorrentArguments extends BodyArguments {

    public static class Builder {
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

        public SetTorrentArguments.Builder setBandwidthPriority(Integer bandwidthPriority) {
            this.bandwidthPriority = bandwidthPriority;
            return this;
        }

        public SetTorrentArguments.Builder setDownloadLimitInKBps(Long downloadLimitInKBps) {
            this.downloadLimitInKBps = downloadLimitInKBps;
            return this;
        }

        public SetTorrentArguments.Builder setDownloadLimited(Boolean downloadLimited) {
            this.downloadLimited = downloadLimited;
            return this;
        }

        public SetTorrentArguments.Builder setFilesToDownload(List<Integer> filesToDownload) {
            this.filesToDownload = filesToDownload;
            return this;
        }

        public SetTorrentArguments.Builder setFilesToSkip(List<Integer> filesToSkip) {
            this.filesToSkip = filesToSkip;
            return this;
        }

        public SetTorrentArguments.Builder setHonorsSessionLimits(Boolean honorsSessionLimits) {
            this.honorsSessionLimits = honorsSessionLimits;
            return this;
        }

        public SetTorrentArguments.Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public SetTorrentArguments.Builder setPeerLimit(Integer peerLimit) {
            this.peerLimit = peerLimit;
            return this;
        }

        public SetTorrentArguments.Builder setHighPriorityFiles(List<Integer> highPriorityFiles) {
            this.highPriorityFiles = highPriorityFiles;
            return this;
        }

        public SetTorrentArguments.Builder setLowPriorityFiles(List<Integer> lowPriorityFiles) {
            this.lowPriorityFiles = lowPriorityFiles;
            return this;
        }

        public SetTorrentArguments.Builder setNormalPriorityFiles(List<Integer> normalPriorityFiles) {
            this.normalPriorityFiles = normalPriorityFiles;
            return this;
        }

        public SetTorrentArguments.Builder setQueuePosition(Integer queuePosition) {
            this.queuePosition = queuePosition;
            return this;
        }

        public SetTorrentArguments.Builder setSeedIdleLimit(Integer seedIdleLimit) {
            this.seedIdleLimit = seedIdleLimit;
            return this;
        }

        public SetTorrentArguments.Builder setSeedIdleMode(Integer seedIdleMode) {
            this.seedIdleMode = seedIdleMode;
            return this;
        }

        public SetTorrentArguments.Builder setSeedRatioLimit(Double seedRatioLimit) {
            this.seedRatioLimit = seedRatioLimit;
            return this;
        }

        public SetTorrentArguments.Builder setSeedRatioMode(Integer seedRatioMode) {
            this.seedRatioMode = seedRatioMode;
            return this;
        }

        public SetTorrentArguments.Builder setTrackersToAdd(List<String> trackersToAdd) {
            this.trackersToAdd = trackersToAdd;
            return this;
        }

        public SetTorrentArguments.Builder setTrackersToRemove(List<String> trackersToRemove) {
            this.trackersToRemove = trackersToRemove;
            return this;
        }

        public SetTorrentArguments.Builder setTrackersToReplace(List<String> trackersToReplace) {
            this.trackersToReplace = trackersToReplace;
            return this;
        }

        public SetTorrentArguments.Builder setUploadLimitInKBps(Long uploadLimitInKBps) {
            this.uploadLimitInKBps = uploadLimitInKBps;
            return this;
        }

        public SetTorrentArguments.Builder setUploadLimited(Boolean uploadLimited) {
            this.uploadLimited = uploadLimited;
            return this;
        }

        public SetTorrentArguments build() {
            return new SetTorrentArguments(bandwidthPriority, downloadLimitInKBps, downloadLimited, filesToDownload, filesToSkip, honorsSessionLimits, location, peerLimit, highPriorityFiles, lowPriorityFiles, normalPriorityFiles, queuePosition, seedIdleLimit, seedIdleMode, seedRatioLimit, seedRatioMode, trackersToAdd, trackersToRemove, trackersToReplace, uploadLimitInKBps, uploadLimited);
        }
    }

        /**
     * Torrent's bandwidth priority
     */
    private Integer bandwidthPriority;

    /**
     * Maximum download speed (KBps)
     */
    @SerializedName("downloadLimit")
    private Long downloadLimitInKBps;

    /**
     * {@code true} if {@code downloadLimitInKBps} is honored
     */
    private Boolean downloadLimited;

    /**
     * Indices of file(s) to download
     */
    @SerializedName("files-wanted")
    private List<Integer> filesToDownload;

    /**
     * Indices of file(s) to not download
     */
    @SerializedName("files-unwanted")
    private List<Integer> filesToSkip;

    /**
     * {@code true} if session upload limits are honored
     */
    private Boolean honorsSessionLimits;

    /**
     * New location of the torrent's content
     */
    private String location;

    /**
     * Maximum number of peers
     */
    @SerializedName("peer-limit")
    private Integer peerLimit;

    /**
     * Indices of high-priority file(s)
     */
    @SerializedName("priority-high")
    private List<Integer> highPriorityFiles;

    /**
     * Indices of low-priority file(s)
     */
    @SerializedName("priority-low")
    private List<Integer> lowPriorityFiles;

    /**
     * Indices of normal-priority file(s)
     */
    @SerializedName("priority-normal")
    private List<Integer> normalPriorityFiles;

    /**
     * Position of this torrent in its queue [0...n)
     */
    private Integer queuePosition;

    /**
     * Torrent-level number of minutes of seeding inactivity
     */
    private Integer seedIdleLimit;

    /**
     * Which seeding inactivity to use
     */
    private Integer seedIdleMode;

    /**
     * Torrent-level seeding ratio
     */
    private Double seedRatioLimit;

    /**
     * Which ratio to use
     */
    private Integer seedRatioMode;

    /**
     * Strings of announce URLs to add
     */
    @SerializedName("trackerAdd")
    private List<String> trackersToAdd;

    /**
     * Ids of trackers to remove
     */
    @SerializedName("trackerRemove")
    private List<String> trackersToRemove;

    /**
     * Pairs of <trackerId/new announce URLs>
     */
    @SerializedName("trackerReplace")
    private List<String> trackersToReplace;

    /**
     * Maximum upload speed (KBps)
     */
    @SerializedName("uploadLimit")
    private Long uploadLimitInKBps;

    /**
     * {@code true} if {@code uploadLimitInKBps} is honored
     */
    private Boolean uploadLimited;


    public SetTorrentArguments() {
    }

    public SetTorrentArguments(Integer bandwidthPriority, Long downloadLimitInKBps, Boolean downloadLimited, List<Integer> filesToDownload, List<Integer> filesToSkip, Boolean honorsSessionLimits, String location, Integer peerLimit, List<Integer> highPriorityFiles, List<Integer> lowPriorityFiles, List<Integer> normalPriorityFiles, Integer queuePosition, Integer seedIdleLimit, Integer seedIdleMode, Double seedRatioLimit, Integer seedRatioMode, List<String> trackersToAdd, List<String> trackersToRemove, List<String> trackersToReplace, Long uploadLimitInKBps, Boolean uploadLimited) {
        this.bandwidthPriority = bandwidthPriority;
        this.downloadLimitInKBps = downloadLimitInKBps;
        this.downloadLimited = downloadLimited;
        this.filesToDownload = filesToDownload;
        this.filesToSkip = filesToSkip;
        this.honorsSessionLimits = honorsSessionLimits;
        this.location = location;
        this.peerLimit = peerLimit;
        this.highPriorityFiles = highPriorityFiles;
        this.lowPriorityFiles = lowPriorityFiles;
        this.normalPriorityFiles = normalPriorityFiles;
        this.queuePosition = queuePosition;
        this.seedIdleLimit = seedIdleLimit;
        this.seedIdleMode = seedIdleMode;
        this.seedRatioLimit = seedRatioLimit;
        this.seedRatioMode = seedRatioMode;
        this.trackersToAdd = trackersToAdd;
        this.trackersToRemove = trackersToRemove;
        this.trackersToReplace = trackersToReplace;
        this.uploadLimitInKBps = uploadLimitInKBps;
        this.uploadLimited = uploadLimited;
    }

    public Integer getBandwidthPriority() {
        return bandwidthPriority;
    }

    public void setBandwidthPriority(Integer bandwidthPriority) {
        this.bandwidthPriority = bandwidthPriority;
    }

    public Long getDownloadLimitInKBps() {
        return downloadLimitInKBps;
    }

    public void setDownloadLimitInKBps(Long downloadLimitInKBps) {
        this.downloadLimitInKBps = downloadLimitInKBps;
    }

    public Boolean getDownloadLimited() {
        return downloadLimited;
    }

    public void setDownloadLimited(Boolean downloadLimited) {
        this.downloadLimited = downloadLimited;
    }

    public List<Integer> getFilesToDownload() {
        return filesToDownload;
    }

    public void setFilesToDownload(List<Integer> filesToDownload) {
        this.filesToDownload = filesToDownload;
    }

    public List<Integer> getFilesToSkip() {
        return filesToSkip;
    }

    public void setFilesToSkip(List<Integer> filesToSkip) {
        this.filesToSkip = filesToSkip;
    }

    public Boolean getHonorsSessionLimits() {
        return honorsSessionLimits;
    }

    public void setHonorsSessionLimits(Boolean honorsSessionLimits) {
        this.honorsSessionLimits = honorsSessionLimits;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPeerLimit() {
        return peerLimit;
    }

    public void setPeerLimit(Integer peerLimit) {
        this.peerLimit = peerLimit;
    }

    public List<Integer> getHighPriorityFiles() {
        return highPriorityFiles;
    }

    public void setHighPriorityFiles(List<Integer> highPriorityFiles) {
        this.highPriorityFiles = highPriorityFiles;
    }

    public List<Integer> getLowPriorityFiles() {
        return lowPriorityFiles;
    }

    public void setLowPriorityFiles(List<Integer> lowPriorityFiles) {
        this.lowPriorityFiles = lowPriorityFiles;
    }

    public List<Integer> getNormalPriorityFiles() {
        return normalPriorityFiles;
    }

    public void setNormalPriorityFiles(List<Integer> normalPriorityFiles) {
        this.normalPriorityFiles = normalPriorityFiles;
    }

    public Integer getQueuePosition() {
        return queuePosition;
    }

    public void setQueuePosition(Integer queuePosition) {
        this.queuePosition = queuePosition;
    }

    public Integer getSeedIdleLimit() {
        return seedIdleLimit;
    }

    public void setSeedIdleLimit(Integer seedIdleLimit) {
        this.seedIdleLimit = seedIdleLimit;
    }

    public Integer getSeedIdleMode() {
        return seedIdleMode;
    }

    public void setSeedIdleMode(Integer seedIdleMode) {
        this.seedIdleMode = seedIdleMode;
    }

    public Double getSeedRatioLimit() {
        return seedRatioLimit;
    }

    public void setSeedRatioLimit(Double seedRatioLimit) {
        this.seedRatioLimit = seedRatioLimit;
    }

    public Integer getSeedRatioMode() {
        return seedRatioMode;
    }

    public void setSeedRatioMode(Integer seedRatioMode) {
        this.seedRatioMode = seedRatioMode;
    }

    public List<String> getTrackersToAdd() {
        return trackersToAdd;
    }

    public void setTrackersToAdd(List<String> trackersToAdd) {
        this.trackersToAdd = trackersToAdd;
    }

    public List<String> getTrackersToRemove() {
        return trackersToRemove;
    }

    public void setTrackersToRemove(List<String> trackersToRemove) {
        this.trackersToRemove = trackersToRemove;
    }

    public List<String> getTrackersToReplace() {
        return trackersToReplace;
    }

    public void setTrackersToReplace(List<String> trackersToReplace) {
        this.trackersToReplace = trackersToReplace;
    }

    public Long getUploadLimitInKBps() {
        return uploadLimitInKBps;
    }

    public void setUploadLimitInKBps(Long uploadLimitInKBps) {
        this.uploadLimitInKBps = uploadLimitInKBps;
    }

    public Boolean getUploadLimited() {
        return uploadLimited;
    }

    public void setUploadLimited(Boolean uploadLimited) {
        this.uploadLimited = uploadLimited;
    }

    

}

