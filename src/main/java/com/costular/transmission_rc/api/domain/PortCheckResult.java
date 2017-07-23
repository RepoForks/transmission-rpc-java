package com.costular.transmission_rc.api.domain;

public class PortCheckResult {

    private boolean open;

    public PortCheckResult() {
    }

    public PortCheckResult(boolean open) {
        this.open = open;
    }

    public Boolean getOpen() {
        return open;
    }
}
