package com.costular.transmission_rc.api.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by costular on 23/07/17.
 */
public class SessionInfo {

    @SerializedName("alt-speed-down")
    private long maxDownloadSpeed;

    @SerializedName("alt-speed-enabled")
    private boolean maxSpeedEnabled;

    /**
     * In minutes after midnight
     */
    @SerializedName("alt-speed-time-begin")
    private long whenSpeedTimeBegin;

    @SerializedName("alt-speed-time-enabled")
    private boolean altSpeedTimeEnabled;

    @SerializedName("alt-speed-time-end")
    private long whenAltSpeedTimeEnd;

    @SerializedName("alt-speed-time-day")
    private long altSpeedTimeDays;

    @SerializedName("alt-speed-up")
    private long globalMaxSpeedUp;

    @SerializedName("blocklist-url")
    private String blocklistURL;

    @SerializedName("blocklist-enabled")
    private boolean blocklistEnabled;

    @SerializedName("blocklist-size")
    private int blocklistSize;

    @SerializedName("cache-size-mb")
    private int cacheSizeInMb;

    @SerializedName("config-dir")
    private String configDir;

    @SerializedName("download-dir")
    private String downloadDir;

    @SerializedName("download-queue-size")
    private int maxQueueSize;

    @SerializedName("download-queue-enabled")
    private boolean downloadQueueEnabled;

    @SerializedName("dht-enabled")
    private boolean dhtEnabled;

    @SerializedName("encryption")
    private String encryption;

    @SerializedName("idle-seeding-limit")
    private long idleSeedingLimit;

    @SerializedName("idle-seeding-limit-enabled")
    private boolean idleSeedingLimitEnabled;

    @SerializedName("incomplete-dir")
    private String incompleteDir;

    @SerializedName("incomplete-dir-enabled")
    private boolean incompleteDirEnabled;

    @SerializedName("lpd-enabled")
    private boolean lpdEnabled;

    @SerializedName("peer-limit-global")
    private int maxGlobalPeers;

    @SerializedName("peer-limit-per-torrent")
    private int maxTorrentPeers;

    @SerializedName("pex-enabled")
    private boolean pexEnabled;

    @SerializedName("peer-port")
    private int peerPort;

    @SerializedName("peer-port-random-on-start")
    private boolean peerPortRandomOnStart;

    @SerializedName("port-forwarding-enabled")
    private boolean portForwardingEnabled;

    @SerializedName("queue-stalled-enabled")
    private boolean queueStalledEnabled;

    @SerializedName("queue-stalled-minutes")
    private int queueStalledMinutes;

    @SerializedName("rename-partial-files")
    private boolean renamePartialFiles;

    @SerializedName("rpc-version")
    private int rpcVersion;

    @SerializedName("rpc-version-minimum")
    private int rpcVersionMinimum;

    @SerializedName("script-torrent-done-filename")
    private String scriptTorrentDoneFilename;

    @SerializedName("script-torrent-done-enabled")
    private boolean scriptTorrentDoneEnabled;

    @SerializedName("seedRatioLimit")
    private double seedRatioLimit;

    @SerializedName("seedRatioLimited")
    private boolean seedRatioLimited;

    @SerializedName("seed-queue-size")
    private int seedQueueSize;

    @SerializedName("seed-queue-enabled")
    private boolean seedQueueEnabled;

    @SerializedName("speed-limit-down")
    private long speedLimitDownKbps;

    @SerializedName("speed-limit-down-enabled")
    private boolean speedDownLimitEnabled;

    @SerializedName("speed-limit-up")
    private long speedLimitUpKbps;

    @SerializedName("speed-limit-up-enabled")
    private boolean speedUpLimitEnabled;

    @SerializedName("start-added-torrents")
    private boolean startAddedTorrents;

    @SerializedName("trash-original-torrent-files")
    private boolean trashOriginalTorrentFiles;

    private Units units;

    @SerializedName("utp-enabled")
    private boolean uptEnabled;

    @SerializedName("version")
    private String version;

    public long getMaxDownloadSpeed() {
        return maxDownloadSpeed;
    }

    public boolean isMaxSpeedEnabled() {
        return maxSpeedEnabled;
    }

    public long getWhenSpeedTimeBegin() {
        return whenSpeedTimeBegin;
    }

    public boolean isAltSpeedTimeEnabled() {
        return altSpeedTimeEnabled;
    }

    public long getWhenAltSpeedTimeEnd() {
        return whenAltSpeedTimeEnd;
    }

    public long getAltSpeedTimeDays() {
        return altSpeedTimeDays;
    }

    public long getGlobalMaxSpeedUp() {
        return globalMaxSpeedUp;
    }

    public String getBlocklistURL() {
        return blocklistURL;
    }

    public boolean isBlocklistEnabled() {
        return blocklistEnabled;
    }

    public int getBlocklistSize() {
        return blocklistSize;
    }

    public int getCacheSizeInMb() {
        return cacheSizeInMb;
    }

    public String getConfigDir() {
        return configDir;
    }

    public String getDownloadDir() {
        return downloadDir;
    }

    public int getMaxQueueSize() {
        return maxQueueSize;
    }

    public boolean isDownloadQueueEnabled() {
        return downloadQueueEnabled;
    }

    public boolean isDhtEnabled() {
        return dhtEnabled;
    }

    public String getEncryption() {
        return encryption;
    }

    public long getIdleSeedingLimit() {
        return idleSeedingLimit;
    }

    public boolean isIdleSeedingLimitEnabled() {
        return idleSeedingLimitEnabled;
    }

    public String getIncompleteDir() {
        return incompleteDir;
    }

    public boolean isIncompleteDirEnabled() {
        return incompleteDirEnabled;
    }

    public boolean isLpdEnabled() {
        return lpdEnabled;
    }

    public int getMaxGlobalPeers() {
        return maxGlobalPeers;
    }

    public int getMaxTorrentPeers() {
        return maxTorrentPeers;
    }

    public boolean isPexEnabled() {
        return pexEnabled;
    }

    public int getPeerPort() {
        return peerPort;
    }

    public boolean isPeerPortRandomOnStart() {
        return peerPortRandomOnStart;
    }

    public boolean isPortForwardingEnabled() {
        return portForwardingEnabled;
    }

    public boolean isQueueStalledEnabled() {
        return queueStalledEnabled;
    }

    public int getQueueStalledMinutes() {
        return queueStalledMinutes;
    }

    public boolean isRenamePartialFiles() {
        return renamePartialFiles;
    }

    public int getRpcVersion() {
        return rpcVersion;
    }

    public int getRpcVersionMinimum() {
        return rpcVersionMinimum;
    }

    public String getScriptTorrentDoneFilename() {
        return scriptTorrentDoneFilename;
    }

    public boolean isScriptTorrentDoneEnabled() {
        return scriptTorrentDoneEnabled;
    }

    public double getSeedRatioLimit() {
        return seedRatioLimit;
    }

    public boolean isSeedRatioLimited() {
        return seedRatioLimited;
    }

    public int getSeedQueueSize() {
        return seedQueueSize;
    }

    public boolean isSeedQueueEnabled() {
        return seedQueueEnabled;
    }

    public long getSpeedLimitDownKbps() {
        return speedLimitDownKbps;
    }

    public boolean isSpeedDownLimitEnabled() {
        return speedDownLimitEnabled;
    }

    public long getSpeedLimitUpKbps() {
        return speedLimitUpKbps;
    }

    public boolean isSpeedUpLimitEnabled() {
        return speedUpLimitEnabled;
    }

    public boolean isStartAddedTorrents() {
        return startAddedTorrents;
    }

    public boolean isTrashOriginalTorrentFiles() {
        return trashOriginalTorrentFiles;
    }

    public Units getUnits() {
        return units;
    }

    public boolean isUptEnabled() {
        return uptEnabled;
    }

    public String getVersion() {
        return version;
    }
}
