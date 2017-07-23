package com.costular.integration;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.TransmissionClient;
import com.costular.transmission_rc.api.domain.AddedTorrentInfo;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import static org.assertj.core.api.Assertions.*;

/**
 * Created by costular on 21/07/17.
 */
public class AddTorrentIntegrationTest extends IntegrationTest {

    @Test
    public void testAddTorrentByMagnetLink() throws ExecutionException, InterruptedException {
        CompletableFuture<AddedTorrentInfo> torrentInfoFuture = new CompletableFuture<>();

        client.addTorrent("magnet:?xt=urn:btih:d4abefdf19c5a9ab73ced389faca97bdcbb2ef3f&dn=debian-9.0.0-amd64-netinst.iso", new TransmissionCallback<AddedTorrentInfo>() {
            @Override
            public void onSuccess(AddedTorrentInfo result) {
                torrentInfoFuture.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        assertThat(torrentInfoFuture.get().getTorrentAdded().getId()).isNotNull();
        assertThat(torrentInfoFuture.get().getTorrentAdded().getName()).isEqualTo("debian-9.0.0-amd64-netinst.iso");
    }

    @Test
    public void testAddTorrentByFile() throws ExecutionException, InterruptedException {
        CompletableFuture<AddedTorrentInfo> torrentInfoFuture = new CompletableFuture<>();

        // Create the torrent file
        File file = new File(getClass().getClassLoader().getResource("debian-9.torrent").getFile());

        // Send the add torrent command
        client.addTorrent(file, new TransmissionCallback<AddedTorrentInfo>() {
            @Override
            public void onSuccess(AddedTorrentInfo result) {
                torrentInfoFuture.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        // Check the names are equal
        assertThat(torrentInfoFuture.get().getTorrentAdded().getName()).isEqualTo("debian-9.0.0-amd64-netinst.iso");
    }
}
