package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.BodyArguments;

import java.util.List;

/**
 * Created by costular on 22/07/17.
 */
public class GetTorrentArguments extends BodyArguments {

    private List<String> fields;

    public GetTorrentArguments(Ids ids, List<String> fields) {
        super(ids);
        this.fields = fields;
    }

    public GetTorrentArguments(Ids ids) {
        super(ids);
        this.fields = Constants.TORRENT_ALL_FIELDS;
    }
}
