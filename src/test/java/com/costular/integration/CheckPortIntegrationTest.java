package com.costular.integration;

import com.costular.transmission_rc.TransmissionCallback;
import com.costular.transmission_rc.api.TransmissionClient;
import org.junit.Test;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by costular on 23/07/17.
 */
public class CheckPortIntegrationTest extends IntegrationTest {

    @Test
    public void testGoodPort() throws ExecutionException, InterruptedException {
        CompletableFuture<Boolean> checkPortFuture = new CompletableFuture<>();

        client.checkPort(new TransmissionCallback<Boolean>() {
            @Override
            public void onSuccess(Boolean result) {
                checkPortFuture.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        // Should be good port
        assertThat(checkPortFuture.get().booleanValue()).isEqualTo(true);
    }

    @Test
    public void testBadPortFails() throws ExecutionException, InterruptedException {
        client = TransmissionClient.getInstance("192.168.1.100", 9000);

        CompletableFuture<Boolean> checkPortFuture = new CompletableFuture<>();

        client.checkPort(new TransmissionCallback<Boolean>() {
            @Override
            public void onSuccess(Boolean result) {
                checkPortFuture.complete(result);
            }

            @Override
            public void onError(String message) {

            }
        });

        // Should be good port
        assertThat(checkPortFuture.get().booleanValue()).isEqualTo(false);
    }
}
