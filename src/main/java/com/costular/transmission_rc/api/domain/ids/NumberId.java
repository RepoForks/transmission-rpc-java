package com.costular.transmission_rc.api.domain.ids;

/**
 * Created by costular on 21/07/17.
 */
public class NumberId extends Ids {

    private long id;

    public NumberId(long id) {
        this.id = id;
    }

    @Override
    public Object theObject() {
        return id;
    }
}
