package com.costular.transmission_rc.api.domain;
import com.costular.transmission_rc.api.domain.ids.Ids;
import com.google.gson.annotations.SerializedName;

public class RemoveTorrentInfo {

    private Ids ids;
    private Boolean deleteLocalData;

    public RemoveTorrentInfo(Ids ids, Boolean deleteLocalData) {
        this.ids = ids;
        this.deleteLocalData = deleteLocalData;
    }

    public Object getIds() {
        if (ids == null) {
            return null;
        }
        return ids.theObject();
    }

    public Boolean getDeleteLocalData() {
        return deleteLocalData;
    }
}
