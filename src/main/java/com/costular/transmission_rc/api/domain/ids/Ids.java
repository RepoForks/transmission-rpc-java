package com.costular.transmission_rc.api.domain.ids;

import java.util.ArrayList;
import java.util.List;

public abstract class Ids {

    public abstract Object theObject();

    public static NumberId createId(long id) {
        return new NumberId(id);
    }

    public static MixedListIds createMixedIds(List<Object> ids) {
        return new MixedListIds(ids);
    }

    public static NumberListIds createIds(List<Long> ids) {
        return new NumberListIds(ids);
    }

    public static RecentlyActiveIds createRecentlyActiveIds() {
        return new RecentlyActiveIds();
    }

    public static OmittedIds createAllIds() {
        return new OmittedIds();
    }
}
