package com.truongpv.myappmusic.Service;

import com.truongpv.myappmusic.Model.QuangCao;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {
    @GET("songbanner.php")
//    Call<List<QuangCao>>;
    Call<QuangCao>GetDataBanner();
}
