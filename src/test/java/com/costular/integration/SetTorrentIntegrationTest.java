package com.costular.integration;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.domain.SetTorrentArguments;
import com.costular.transmission_rc.api.domain.TorrentInfoCollection;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by costular on 23/07/17.
 */
public class SetTorrentIntegrationTest extends IntegrationTest {

    @Override
    public void setUp() {
        super.setUp();

        client.addTorrent("magnet:?xt=urn:btih:d4abefdf19c5a9ab73ced389faca97bdcbb2ef3f&dn=debian-9.0.0-amd64-netinst.iso", null);

        pause();
    }

    @Test
    public void testChangeTorrent() throws ExecutionException, InterruptedException {
        SetTorrentArguments info = new SetTorrentArguments.Builder()
                .setDownloadLimited(true)
                .setDownloadLimitInKBps(200L)
                .setLocation("/test")
                .build();

        // Change torrent
        client.setAllTorrentsInfo(info, null);

        // wait a bit
        pause();

        CompletableFuture<TorrentInfoCollection> torrentInfo = new CompletableFuture<>();
        client.getAllTorrentsInfo(new TransmissionCallback<TorrentInfoCollection>() {
            @Override
            public void onSuccess(TorrentInfoCollection result) {
                torrentInfo.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        assertThat(torrentInfo.get().getTorrents().get(0).getDownloadLimited()).isEqualTo(true);
        assertThat(torrentInfo.get().getTorrents().get(0).getDownloadLimit()).isEqualTo(200L);
    }
}
