package com.costular.transmission_rc.api.domain;

import com.google.gson.annotations.SerializedName;

public class AddedTorrentInfo {

    @SerializedName("torrent-added")
    private final TorrentInfo torrentAdded;

    @SerializedName("torrent-duplicate")
    private final TorrentInfo torrentDuplicate;

    public AddedTorrentInfo(TorrentInfo torrentAdded, TorrentInfo torrentDuplicate) {
        this.torrentAdded = torrentAdded;
        this.torrentDuplicate = torrentDuplicate;
    }

    public TorrentInfo getTorrentInfo() {
        return torrentAdded == null ? torrentDuplicate : torrentAdded;
    }

    public boolean isDuplicate() {
        return torrentDuplicate != null;
    }

    public TorrentInfo getTorrentAdded() {
        return torrentAdded;
    }

    public TorrentInfo getTorrentDuplicate() {
        return torrentDuplicate;
    }
}
