package com.costular.integration;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.domain.SessionInfo;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by costular on 23/07/17.
 */
public class GetSessionDataTest extends IntegrationTest {

    @Test
    public void testGetSimpleSessionData() throws ExecutionException, InterruptedException {
        CompletableFuture<SessionInfo> sessionFuture = new CompletableFuture<>();

        client.getSessionData(new TransmissionCallback<SessionInfo>() {
            @Override
            public void onSuccess(SessionInfo result) {
                sessionFuture.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        assertThat(sessionFuture.get().getDownloadDir()).isNotNull();
    }
}
