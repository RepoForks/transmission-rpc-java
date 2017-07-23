package com.costular.transmission_rc.http;

/**
 * Created by costular on 21/07/17.
 */
public class ModelResponse<T> {

    T arguments;
    String result;

    public T getArguments() {
        return arguments;
    }

    public String getResult() {
        return result;
    }
}
