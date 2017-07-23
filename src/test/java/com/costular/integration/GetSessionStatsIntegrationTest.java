package com.costular.integration;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.TransmissionClient;
import com.costular.transmission_rc.api.domain.SessionStats;
import org.junit.Test;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by costular on 21/07/17.
 */
public class GetSessionStatsIntegrationTest extends IntegrationTest {

    @Override
    public void setUp() {
        super.setUp();

        // Add normal torrent
        client.addTorrent("magnet:?xt=urn:btih:d4abefdf19c5a9ab73ced389faca97bdcbb2ef3f&dn=debian-9.0.0-amd64-netinst.iso", null);

        // Add paused torrent
        client.addTorrent("magnet:?xt=urn:btih:59066769b9ad42da2e508611c33d7c4480b3857b&dn=ubuntu-17.04-desktop-amd64.iso", true, null);

        // Wait a bit
        pause();
    }

    @Test
    public void testCountOfTorrents() throws TimeoutException, ExecutionException, InterruptedException {
        CompletableFuture<SessionStats> statsFuture = new CompletableFuture<>();

        client.getSessionStatistics(new TransmissionCallback<SessionStats>() {
            @Override
            public void onSuccess(SessionStats result) {
                statsFuture.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        assertThat(statsFuture.get().getTorrentCount()).isEqualTo(2L);
        assertThat(statsFuture.get().getActiveTorrentCount()).isEqualTo(1L);
        assertThat(statsFuture.get().getPausedTorrentCount()).isEqualTo(1L);
    }

}
