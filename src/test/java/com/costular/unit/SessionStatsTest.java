package com.costular.unit;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.TransmissionClient;
import com.costular.transmission_rc.api.domain.SessionStats;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

/**
 * Created by costular on 21/07/17.
 */
public class SessionStatsTest {

    @Mock
    TransmissionClient client;

    @Captor
    TransmissionCallback<SessionStats> transmissionCallback;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSimpleStats() {
        SessionStats stats = new SessionStats(2L, 100L, 1L, 3L, 10L, null, null);

        // Call the async method


        // Check some stats
        assertEquals(2L, stats.getActiveTorrentCount());
        assertEquals(100L, stats.getDownloadSpeed());
        assertEquals(1L, stats.getPausedTorrentCount());
        assertEquals(3L, stats.getTorrentCount());
    }
}
