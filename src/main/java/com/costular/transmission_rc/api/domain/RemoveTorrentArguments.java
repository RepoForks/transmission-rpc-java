package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.BodyArguments;
import com.google.gson.annotations.SerializedName;

/**
 * Created by costular on 22/07/17.
 */
public class RemoveTorrentArguments extends BodyArguments {

    @SerializedName("delete-local-data")
    boolean deleteLocalData;

    public RemoveTorrentArguments(Ids ids, boolean deleteLocalData) {
        super(ids);
        this.deleteLocalData = deleteLocalData;
    }

    public boolean isDeleteLocalData() {
        return deleteLocalData;
    }
}
