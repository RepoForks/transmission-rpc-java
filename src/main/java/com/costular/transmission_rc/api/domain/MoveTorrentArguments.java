package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.BodyArguments;

/**
 * Created by costular on 23/07/17.
 */
public class MoveTorrentArguments extends BodyArguments {

    private String location;
    private boolean move;

    public MoveTorrentArguments(Ids ids, String location, boolean move) {
        super(ids);
        this.location = location;
        this.move = move;
    }

    public MoveTorrentArguments(Ids ids, String location) {
        super(ids);
        this.location = location;
        this.move = false;
    }
}
