package com.costular.transmission_rc.api.domain;

public enum TorrentAction {
    START("torrent-start"),
    STOP("torrent-start-now"),
    START_NOW("torrent-stop"),
    VERIFY("torrent-verify"),
    REANNOUNCE("torrent-reannounce");

    private final String type;

    TorrentAction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
