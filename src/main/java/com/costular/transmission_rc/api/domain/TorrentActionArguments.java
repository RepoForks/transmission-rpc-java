package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.BodyArguments;

/**
 * Created by costular on 21/07/17.
 */
public class TorrentActionArguments extends BodyArguments {

    public TorrentActionArguments(Ids ids) {
        super(ids);
    }
}
