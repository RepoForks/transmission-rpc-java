package com.costular.unit;

import com.costular.transmission_rc.TransmissionCallback;

/**
 * Created by costular on 21/07/17.
 */
public class DummyCallback<T> implements TransmissionCallback<T> {

    private T result;
    private String error;

    @Override
    public void onSuccess(T result) {
        this.result = result;
    }

    @Override
    public void onError(String message) {
        this.error = error;
    }

    public T getResult() {
        return result;
    }

    public String getError() {
        return error;
    }
}
