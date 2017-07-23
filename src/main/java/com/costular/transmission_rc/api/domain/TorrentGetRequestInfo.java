package com.costular.transmission_rc.api.domain;

import com.costular.transmission_rc.api.domain.ids.Ids;

import java.util.List;

public class TorrentGetRequestInfo {

    private Ids ids;
    private List<String> fields;

    public TorrentGetRequestInfo(Ids ids, List<String> fields) {
        this.ids = ids;
        this.fields = fields;
    }

    public Object getIds() {
        if (ids == null) {
            return ids;
        }
        return ids.theObject();
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

}
