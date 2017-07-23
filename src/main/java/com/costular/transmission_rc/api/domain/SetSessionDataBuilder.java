package com.costular.transmission_rc.api.domain;

/**
 * Created by costular on 23/07/17.
 */
public final class SetSessionDataBuilder {
    private long maxDownloadSpeed;
    private boolean maxSpeedEnabled;
    private long whenSpeedTimeBegin;
    private boolean altSpeedTimeEnabled;
    private long whenAltSpeedTimeEnd;
    private long altSpeedTimeDays;
    private long globalMaxSpeedUp;
    private String blocklistURL;
    private boolean blocklistEnabled;
    private int blocklistSize;
    private int cacheSizeInMb;
    private String downloadDir;
    private int maxQueueSize;
    private boolean downloadQueueEnabled;
    private boolean dhtEnabled;
    private String encryption;
    private long idleSeedingLimit;
    private boolean idleSeedingLimitEnabled;
    private String incompleteDir;
    private boolean incompleteDirEnabled;
    private boolean lpdEnabled;
    private int maxGlobalPeers;
    private int maxTorrentPeers;
    private boolean pexEnabled;
    private int peerPort;
    private boolean peerPortRandomOnStart;
    private boolean portForwardingEnabled;
    private boolean queueStalledEnabled;
    private int queueStalledMinutes;
    private boolean renamePartialFiles;
    private String scriptTorrentDoneFilename;
    private boolean scriptTorrentDoneEnabled;
    private double seedRatioLimit;
    private boolean seedRatioLimited;
    private int seedQueueSize;
    private boolean seedQueueEnabled;
    private long speedLimitDownKbps;
    private boolean speedDownLimitEnabled;
    private long speedLimitUpKbps;
    private boolean speedUpLimitEnabled;
    private boolean startAddedTorrents;
    private boolean trashOriginalTorrentFiles;
    private Units units;
    private boolean uptEnabled;

    private SetSessionDataBuilder() {
    }

    public static SetSessionDataBuilder generate() {
        return new SetSessionDataBuilder();
    }

    public SetSessionDataBuilder withMaxDownloadSpeed(long maxDownloadSpeed) {
        this.maxDownloadSpeed = maxDownloadSpeed;
        return this;
    }

    public SetSessionDataBuilder withMaxSpeedEnabled(boolean maxSpeedEnabled) {
        this.maxSpeedEnabled = maxSpeedEnabled;
        return this;
    }

    public SetSessionDataBuilder withWhenSpeedTimeBegin(long whenSpeedTimeBegin) {
        this.whenSpeedTimeBegin = whenSpeedTimeBegin;
        return this;
    }

    public SetSessionDataBuilder withAltSpeedTimeEnabled(boolean altSpeedTimeEnabled) {
        this.altSpeedTimeEnabled = altSpeedTimeEnabled;
        return this;
    }

    public SetSessionDataBuilder withWhenAltSpeedTimeEnd(long whenAltSpeedTimeEnd) {
        this.whenAltSpeedTimeEnd = whenAltSpeedTimeEnd;
        return this;
    }

    public SetSessionDataBuilder withAltSpeedTimeDays(long altSpeedTimeDays) {
        this.altSpeedTimeDays = altSpeedTimeDays;
        return this;
    }

    public SetSessionDataBuilder withGlobalMaxSpeedUp(long globalMaxSpeedUp) {
        this.globalMaxSpeedUp = globalMaxSpeedUp;
        return this;
    }

    public SetSessionDataBuilder withBlocklistURL(String blocklistURL) {
        this.blocklistURL = blocklistURL;
        return this;
    }

    public SetSessionDataBuilder withBlocklistEnabled(boolean blocklistEnabled) {
        this.blocklistEnabled = blocklistEnabled;
        return this;
    }

    public SetSessionDataBuilder withBlocklistSize(int blocklistSize) {
        this.blocklistSize = blocklistSize;
        return this;
    }

    public SetSessionDataBuilder withCacheSizeInMb(int cacheSizeInMb) {
        this.cacheSizeInMb = cacheSizeInMb;
        return this;
    }

    public SetSessionDataBuilder withDownloadDir(String downloadDir) {
        this.downloadDir = downloadDir;
        return this;
    }

    public SetSessionDataBuilder withMaxQueueSize(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        return this;
    }

    public SetSessionDataBuilder withDownloadQueueEnabled(boolean downloadQueueEnabled) {
        this.downloadQueueEnabled = downloadQueueEnabled;
        return this;
    }

    public SetSessionDataBuilder withDhtEnabled(boolean dhtEnabled) {
        this.dhtEnabled = dhtEnabled;
        return this;
    }

    public SetSessionDataBuilder withEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    public SetSessionDataBuilder withIdleSeedingLimit(long idleSeedingLimit) {
        this.idleSeedingLimit = idleSeedingLimit;
        return this;
    }

    public SetSessionDataBuilder withIdleSeedingLimitEnabled(boolean idleSeedingLimitEnabled) {
        this.idleSeedingLimitEnabled = idleSeedingLimitEnabled;
        return this;
    }

    public SetSessionDataBuilder withIncompleteDir(String incompleteDir) {
        this.incompleteDir = incompleteDir;
        return this;
    }

    public SetSessionDataBuilder withIncompleteDirEnabled(boolean incompleteDirEnabled) {
        this.incompleteDirEnabled = incompleteDirEnabled;
        return this;
    }

    public SetSessionDataBuilder withLpdEnabled(boolean lpdEnabled) {
        this.lpdEnabled = lpdEnabled;
        return this;
    }

    public SetSessionDataBuilder withMaxGlobalPeers(int maxGlobalPeers) {
        this.maxGlobalPeers = maxGlobalPeers;
        return this;
    }

    public SetSessionDataBuilder withMaxTorrentPeers(int maxTorrentPeers) {
        this.maxTorrentPeers = maxTorrentPeers;
        return this;
    }

    public SetSessionDataBuilder withPexEnabled(boolean pexEnabled) {
        this.pexEnabled = pexEnabled;
        return this;
    }

    public SetSessionDataBuilder withPeerPort(int peerPort) {
        this.peerPort = peerPort;
        return this;
    }

    public SetSessionDataBuilder withPeerPortRandomOnStart(boolean peerPortRandomOnStart) {
        this.peerPortRandomOnStart = peerPortRandomOnStart;
        return this;
    }

    public SetSessionDataBuilder withPortForwardingEnabled(boolean portForwardingEnabled) {
        this.portForwardingEnabled = portForwardingEnabled;
        return this;
    }

    public SetSessionDataBuilder withQueueStalledEnabled(boolean queueStalledEnabled) {
        this.queueStalledEnabled = queueStalledEnabled;
        return this;
    }

    public SetSessionDataBuilder withQueueStalledMinutes(int queueStalledMinutes) {
        this.queueStalledMinutes = queueStalledMinutes;
        return this;
    }

    public SetSessionDataBuilder withRenamePartialFiles(boolean renamePartialFiles) {
        this.renamePartialFiles = renamePartialFiles;
        return this;
    }

    public SetSessionDataBuilder withScriptTorrentDoneFilename(String scriptTorrentDoneFilename) {
        this.scriptTorrentDoneFilename = scriptTorrentDoneFilename;
        return this;
    }

    public SetSessionDataBuilder withScriptTorrentDoneEnabled(boolean scriptTorrentDoneEnabled) {
        this.scriptTorrentDoneEnabled = scriptTorrentDoneEnabled;
        return this;
    }

    public SetSessionDataBuilder withSeedRatioLimit(double seedRatioLimit) {
        this.seedRatioLimit = seedRatioLimit;
        return this;
    }

    public SetSessionDataBuilder withSeedRatioLimited(boolean seedRatioLimited) {
        this.seedRatioLimited = seedRatioLimited;
        return this;
    }

    public SetSessionDataBuilder withSeedQueueSize(int seedQueueSize) {
        this.seedQueueSize = seedQueueSize;
        return this;
    }

    public SetSessionDataBuilder withSeedQueueEnabled(boolean seedQueueEnabled) {
        this.seedQueueEnabled = seedQueueEnabled;
        return this;
    }

    public SetSessionDataBuilder withSpeedLimitDownKbps(long speedLimitDownKbps) {
        this.speedLimitDownKbps = speedLimitDownKbps;
        return this;
    }

    public SetSessionDataBuilder withSpeedDownLimitEnabled(boolean speedDownLimitEnabled) {
        this.speedDownLimitEnabled = speedDownLimitEnabled;
        return this;
    }

    public SetSessionDataBuilder withSpeedLimitUpKbps(long speedLimitUpKbps) {
        this.speedLimitUpKbps = speedLimitUpKbps;
        return this;
    }

    public SetSessionDataBuilder withSpeedUpLimitEnabled(boolean speedUpLimitEnabled) {
        this.speedUpLimitEnabled = speedUpLimitEnabled;
        return this;
    }

    public SetSessionDataBuilder withStartAddedTorrents(boolean startAddedTorrents) {
        this.startAddedTorrents = startAddedTorrents;
        return this;
    }

    public SetSessionDataBuilder withTrashOriginalTorrentFiles(boolean trashOriginalTorrentFiles) {
        this.trashOriginalTorrentFiles = trashOriginalTorrentFiles;
        return this;
    }

    public SetSessionDataBuilder withUnits(Units units) {
        this.units = units;
        return this;
    }

    public SetSessionDataBuilder withUptEnabled(boolean uptEnabled) {
        this.uptEnabled = uptEnabled;
        return this;
    }

    public SetSessionData build() {
        SetSessionData setSessionData = new SetSessionData(maxDownloadSpeed, maxSpeedEnabled, whenSpeedTimeBegin, altSpeedTimeEnabled, whenAltSpeedTimeEnd, altSpeedTimeDays, globalMaxSpeedUp, blocklistURL, blocklistEnabled, blocklistSize, cacheSizeInMb, downloadDir, maxQueueSize, downloadQueueEnabled, dhtEnabled, encryption, idleSeedingLimit, idleSeedingLimitEnabled, incompleteDir, incompleteDirEnabled, lpdEnabled, maxGlobalPeers, maxTorrentPeers, pexEnabled, peerPort, peerPortRandomOnStart, portForwardingEnabled, queueStalledEnabled, queueStalledMinutes, renamePartialFiles, scriptTorrentDoneFilename, scriptTorrentDoneEnabled, seedRatioLimit, seedRatioLimited, seedQueueSize, seedQueueEnabled, speedLimitDownKbps, speedDownLimitEnabled, speedLimitUpKbps, speedUpLimitEnabled, startAddedTorrents, trashOriginalTorrentFiles, units, uptEnabled);
        return setSessionData;
    }
}
