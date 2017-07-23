package com.costular.integration;

import com.costular.transmission_rc.api.TransmissionClient;
import org.junit.After;
import org.junit.Before;

/**
 * Created by costular on 21/07/17.
 */
public abstract class IntegrationTest {
    static final String RPC_URL = "http://192.168.1.100:9091";

    TransmissionClient client;

    @Before
    public void setUp() {
        client = TransmissionClient.getInstance(RPC_URL);
    }

    @After
    public void tearDown() {
        client.deleteAllTorrents(true, null);
    }

    void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
