package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.api.domain.ids.Ids;
import com.costular.transmission_rc.http.command.BodyArguments;

/**
 * Created by costular on 23/07/17.
 */
public class QueueMovementArguments extends BodyArguments {

    public QueueMovementArguments(Ids ids) {
        super(ids);
    }
}
