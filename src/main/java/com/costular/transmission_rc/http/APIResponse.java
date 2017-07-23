package com.costular.transmission_rc.http;

import com.costular.transmission_rc.TransmissionCallback;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by costular on 21/07/17.
 */
public class APIResponse<T> implements Callback<ModelResponse<T>> {

    private TransmissionCallback<T> callback;

    public APIResponse(TransmissionCallback<T> callback) {
        this.callback = callback;
    }


    @Override
    public void onResponse(Call<ModelResponse<T>> call, Response<ModelResponse<T>> response) {
        if (callback == null) {
            return;
        }

        if (response.isSuccessful()) {
            callback.onSuccess(response.body().getArguments());
        } else {
            try {
                callback.onError(response.errorBody().string());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onFailure(Call<ModelResponse<T>> call, Throwable t) {
        if (callback == null) {
            return;
        }

        callback.onError(t.getMessage());
    }
}
