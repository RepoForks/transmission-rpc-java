package com.costular.transmission_rc.api.domain.ids;

public class OmittedIds extends Ids {

    private Object nullObject;

    @Override
    public Object theObject() {
        return nullObject;
    }
}
