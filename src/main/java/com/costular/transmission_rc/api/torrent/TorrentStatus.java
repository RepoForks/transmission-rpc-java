package com.costular.transmission_rc.api.torrent;

import java.util.NoSuchElementException;

public class TorrentStatus {

    public static final long STOPPED = 0L; // Torrent is stopped
    public static final long CHECK_WAIT = 1L; // Queued to check files
    public static final long CHECK = 2L; // Checking files
    public static final long DOWNLOAD_WAIT = 3L; // Queued to download
    public static final long DOWNLOADING = 4L; // Downloading
    public static final long EED_WAIT = 5L; // Queued to seed
    public static final long SEED = 6L; // Seeding
    public static final long ISOLATED = 7L; // Torrent can't find peers

    private Long longValue;

    TorrentStatus(long l) {
        this.longValue = l;
    }

    public static String get(Long longValue) {
        // TODO don't forget this!!
        return "";
    }

    public Long getValue() {
        return longValue;
    }
}
