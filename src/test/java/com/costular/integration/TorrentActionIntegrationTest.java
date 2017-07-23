package com.costular.integration;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.domain.AddedTorrentInfo;
import com.costular.transmission_rc.api.domain.TorrentAction;
import com.costular.transmission_rc.api.domain.TorrentInfo;
import com.costular.transmission_rc.api.domain.TorrentInfoCollection;
import com.costular.transmission_rc.api.torrent.TorrentStatus;
import org.junit.Test;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by costular on 22/07/17.
 */
public class TorrentActionIntegrationTest extends IntegrationTest {

    private TorrentInfo torrent;

    @Override
    public void setUp() {
        super.setUp();

        client.addTorrent("magnet:?xt=urn:btih:d4abefdf19c5a9ab73ced389faca97bdcbb2ef3f&dn=debian-9.0.0-amd64-netinst.iso", null);
        client.addTorrent("magnet:?xt=urn:btih:59066769b9ad42da2e508611c33d7c4480b3857b&dn=ubuntu-17.04-desktop-amd64.iso", true, new TransmissionCallback<AddedTorrentInfo>() {
            @Override
            public void onSuccess(AddedTorrentInfo result) {
                torrent = result.getTorrentAdded();
            }

            @Override
            public void onError(String message) {

            }
        });

        // Wait a bit
        pause();
    }

    @Test
    public void testPlayTorrent() throws ExecutionException, InterruptedException {
        // Start the torrent
        client.doAction(torrent.getId(), TorrentAction.START, null);

        // Wait a bit
        pause();

        // Assert that was successfull
        CompletableFuture<TorrentInfo> torrentFuture = new CompletableFuture<>();
        client.getTorrentInfo(torrent.getId(), new TransmissionCallback<TorrentInfoCollection>() {
            @Override
            public void onSuccess(TorrentInfoCollection result) {
                torrentFuture.complete(result.getTorrents().get(0));
            }

            @Override
            public void onError(String message) {

            }
        });

        assertThat(torrentFuture.get().getStatus()).isEqualTo(TorrentStatus.DOWNLOADING);
    }

    @Test
    public void testPlayAllTorrents() throws ExecutionException, InterruptedException {
        client.doActionToAll(TorrentAction.START, null);

        pause();

        CompletableFuture<TorrentInfoCollection> torrentFutures = new CompletableFuture<>();
        client.getAllTorrentsInfo(new TransmissionCallback<TorrentInfoCollection>() {
            @Override
            public void onSuccess(TorrentInfoCollection result) {
                torrentFutures.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        assertThat(torrentFutures.get().getTorrents().get(0).getStatus()).isEqualTo(TorrentStatus.DOWNLOADING);
        assertThat(torrentFutures.get().getTorrents().get(1).getStatus()).isEqualTo(TorrentStatus.DOWNLOADING);
    }
}
