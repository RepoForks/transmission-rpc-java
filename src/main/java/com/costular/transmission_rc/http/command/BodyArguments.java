package com.costular.transmission_rc.http.command;

import com.costular.transmission_rc.api.domain.ids.Ids;

import javax.annotation.Nullable;

/**
 * Created by costular on 21/07/17.
 */
public class BodyArguments {

    @Nullable
    Ids ids;

    public BodyArguments(Ids ids) {
        this.ids = ids;
    }

    public BodyArguments() {
    }

    @Nullable
    public Ids getIds() {
        return ids;
    }

    public void setIds(@Nullable Ids ids) {
        this.ids = ids;
    }
}
