package com.costular.transmission_rc.api.domain;

public enum QueueAction {
    MOVE_TOP("queue-move-top"),
    MOVE_UP("queue-move-up"),
    MOVE_DOWN("queue-move-down"),
    MOVE_BOTTOM("queue-move-bottom");

    private final String type;

    QueueAction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
