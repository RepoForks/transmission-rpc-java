package com.costular.transmission_rc;

/**
 * Created by costular on 21/07/17.
 */
public interface TransmissionCallback<T> {
        void onSuccess(T result);
        void onError(String message);
}
