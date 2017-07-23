package com.costular.integration;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.domain.SessionInfo;
import com.costular.transmission_rc.api.domain.SetSessionData;
import com.costular.transmission_rc.api.domain.SetSessionDataBuilder;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by costular on 23/07/17.
 */
public class SetSessionInfoTest extends IntegrationTest {

    @Test
    public void testChangeSessionData() throws ExecutionException, InterruptedException {
        SetSessionData setSessionData = SetSessionDataBuilder.generate()
                .withMaxDownloadSpeed(100L)
                .withDownloadDir("testing")
                .build();

        client.changeSessionData(setSessionData, null);

        pause();

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

        assertThat(sessionFuture.get().getDownloadDir()).isEqualTo("testing");
        assertThat(sessionFuture.get().getMaxDownloadSpeed()).isEqualTo(100L);
    }
}
