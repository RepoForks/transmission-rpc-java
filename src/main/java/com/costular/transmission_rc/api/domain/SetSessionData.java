package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.http.command.BodyArguments;
import com.google.gson.annotations.SerializedName;

/**
 * Created by costular on 23/07/17.
 */
public class SetSessionData extends BodyArguments {

    public SetSessionData(long maxDownloadSpeed, boolean maxSpeedEnabled, long whenSpeedTimeBegin, boolean altSpeedTimeEnabled, long whenAltSpeedTimeEnd, long altSpeedTimeDays, long globalMaxSpeedUp, String blocklistURL, boolean blocklistEnabled, int blocklistSize, int cacheSizeInMb, String downloadDir, int maxQueueSize, boolean downloadQueueEnabled, boolean dhtEnabled, String encryption, long idleSeedingLimit, boolean idleSeedingLimitEnabled, String incompleteDir, boolean incompleteDirEnabled, boolean lpdEnabled, int maxGlobalPeers, int maxTorrentPeers, boolean pexEnabled, int peerPort, boolean peerPortRandomOnStart, boolean portForwardingEnabled, boolean queueStalledEnabled, int queueStalledMinutes, boolean renamePartialFiles, String scriptTorrentDoneFilename, boolean scriptTorrentDoneEnabled, double seedRatioLimit, boolean seedRatioLimited, int seedQueueSize, boolean seedQueueEnabled, long speedLimitDownKbps, boolean speedDownLimitEnabled, long speedLimitUpKbps, boolean speedUpLimitEnabled, boolean startAddedTorrents, boolean trashOriginalTorrentFiles, Units units, boolean uptEnabled) {
        this.maxDownloadSpeed = maxDownloadSpeed;
        this.maxSpeedEnabled = maxSpeedEnabled;
        this.whenSpeedTimeBegin = whenSpeedTimeBegin;
        this.altSpeedTimeEnabled = altSpeedTimeEnabled;
        this.whenAltSpeedTimeEnd = whenAltSpeedTimeEnd;
        this.altSpeedTimeDays = altSpeedTimeDays;
        this.globalMaxSpeedUp = globalMaxSpeedUp;
        this.blocklistURL = blocklistURL;
        this.blocklistEnabled = blocklistEnabled;
        this.blocklistSize = blocklistSize;
        this.cacheSizeInMb = cacheSizeInMb;
        this.downloadDir = downloadDir;
        this.maxQueueSize = maxQueueSize;
        this.downloadQueueEnabled = downloadQueueEnabled;
        this.dhtEnabled = dhtEnabled;
        this.encryption = encryption;
        this.idleSeedingLimit = idleSeedingLimit;
        this.idleSeedingLimitEnabled = idleSeedingLimitEnabled;
        this.incompleteDir = incompleteDir;
        this.incompleteDirEnabled = incompleteDirEnabled;
        this.lpdEnabled = lpdEnabled;
        this.maxGlobalPeers = maxGlobalPeers;
        this.maxTorrentPeers = maxTorrentPeers;
        this.pexEnabled = pexEnabled;
        this.peerPort = peerPort;
        this.peerPortRandomOnStart = peerPortRandomOnStart;
        this.portForwardingEnabled = portForwardingEnabled;
        this.queueStalledEnabled = queueStalledEnabled;
        this.queueStalledMinutes = queueStalledMinutes;
        this.renamePartialFiles = renamePartialFiles;
        this.scriptTorrentDoneFilename = scriptTorrentDoneFilename;
        this.scriptTorrentDoneEnabled = scriptTorrentDoneEnabled;
        this.seedRatioLimit = seedRatioLimit;
        this.seedRatioLimited = seedRatioLimited;
        this.seedQueueSize = seedQueueSize;
        this.seedQueueEnabled = seedQueueEnabled;
        this.speedLimitDownKbps = speedLimitDownKbps;
        this.speedDownLimitEnabled = speedDownLimitEnabled;
        this.speedLimitUpKbps = speedLimitUpKbps;
        this.speedUpLimitEnabled = speedUpLimitEnabled;
        this.startAddedTorrents = startAddedTorrents;
        this.trashOriginalTorrentFiles = trashOriginalTorrentFiles;
        this.units = units;
        this.uptEnabled = uptEnabled;
    }

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

}
