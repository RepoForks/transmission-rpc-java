package com.costular.transmission_rc.http;

import com.costular.transmission_rc.api.domain.SessionInfo;
import com.costular.transmission_rc.http.command.general.CheckPortCommand;
import com.costular.transmission_rc.http.command.general.CloseConnectionCommand;
import com.costular.transmission_rc.http.command.general.GetSessionDataCommand;
import com.costular.transmission_rc.http.command.general.SetSessionDataCommand;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by costular on 23/07/17.
 */
public interface GeneralService {

    @POST(APIFactory.PATH)
    Call<ModelResponse<Boolean>> checkPort(@Body CheckPortCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<SessionInfo>> getSessionInfo(@Body GetSessionDataCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<Boolean>> setSessionInfo(@Body SetSessionDataCommand body);

    @POST(APIFactory.PATH)
    Call<Void> closeConnection(@Body CloseConnectionCommand body);
}
