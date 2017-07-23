package com.costular.transmission_rc.http;

import com.costular.transmission_rc.api.domain.SessionStats;
import com.costular.transmission_rc.http.command.statistics.SessionStatsBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by costular on 21/07/17.
 */
public interface SessionService {

    @POST(APIFactory.PATH)
    Call<ModelResponse<SessionStats>> getSessionStatistics(@Body SessionStatsBody statsBody);
}
