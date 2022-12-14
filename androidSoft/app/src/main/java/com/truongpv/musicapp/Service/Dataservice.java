package com.truongpv.musicapp.Service;

import com.truongpv.musicapp.Model.Playlist;
import com.truongpv.musicapp.Model.Quangcao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {
    @GET("songbanner.php")
    Call<List<Quangcao>> GetDataBanner();
    @GET("playlistforcurrentday.php")
    Call<List<Playlist>>GetPlaylistCurrentDay();
}
