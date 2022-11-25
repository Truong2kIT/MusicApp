package com.truongpv.myappmusic.Fagment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.truongpv.myappmusic.Model.QuangCao;
import com.truongpv.myappmusic.R;
import com.truongpv.myappmusic.Service.APIService;
import com.truongpv.myappmusic.Service.DataService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Banner extends Fragment {
    View view;
    @Nullable
    @androidx.annotation.Nullable
    @Override
    public View onCreateView(@NonNull @androidx.annotation.NonNull LayoutInflater inflater, @Nullable @androidx.annotation.Nullable ViewGroup container, @Nullable @androidx.annotation.Nullable Bundle savedInstanceState) {
       view =inflater.inflate(R.layout.fragment_banner,container,false);
       GetData();
       return view;
    }
`0
    private void GetData() {
        DataService dataService= APIService.getService();
        Call<List<QuangCao>>callback = dataService.GetDataBanner();
        callback.enqueue(new Callback<QuangCao>() {
            @Override
            public void onResponse(Call<QuangCao> call, Response<QuangCao> response) {
                ArrayList<QuangCao> banner = response.body();
            }

            @Override
            public void onFailure(Call<QuangCao> call, Throwable t) {

            }
        });
    }
}
