package com.costular.transmission_rc.http;

import com.costular.transmission_rc.api.domain.AddedTorrentInfo;
import com.costular.transmission_rc.api.domain.TorrentInfo;
import com.costular.transmission_rc.api.domain.TorrentInfoCollection;
import com.costular.transmission_rc.http.command.torrent.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by costular on 20/07/17.
 */
public interface TorrentService {

    @POST(APIFactory.PATH)
    Call<ModelResponse<TorrentInfoCollection>> getTorrentInfo(@Body GetTorrentCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<Boolean>> torrentAction(@Body TorrentActionCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<AddedTorrentInfo>> addTorrent(@Body AddTorrentCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<Boolean>> moveTorrent(@Body MoveTorrentCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<Boolean>> removeTorrent(@Body RemoveTorrentCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<Boolean>> setTorrent(@Body SetTorrentCommand body);

    @POST(APIFactory.PATH)
    Call<ModelResponse<Boolean>> queueMovement(@Body QueueMovementCommand body);
}
