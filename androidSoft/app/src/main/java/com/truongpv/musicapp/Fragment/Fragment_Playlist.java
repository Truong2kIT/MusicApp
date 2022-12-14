package com.truongpv.musicapp.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.truongpv.musicapp.Model.Playlist;
import com.truongpv.musicapp.R;
import com.truongpv.musicapp.Service.APIService;
import com.truongpv.musicapp.Service.Dataservice;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Playlist extends Fragment {
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_playlist,container,false);
        GetData();
        return view;
    }

    private void GetData() {
        Dataservice dataService = APIService.getService();
        Call<List<Playlist>> callback = dataService.GetPlaylistCurrentDay();
        callback.enqueue(new Callback<List<Playlist>>() {
            @Override
            public void onResponse(Call<List<Playlist>> call, Response<List<Playlist>> response) {
                ArrayList<Playlist> mangplaylist = (ArrayList<Playlist>) response.body();
                Log.d("bbb",mangplaylist.get(0).getTen());
            }

            @Override
            public void onFailure(Call<List<Playlist>> call, Throwable t) {

            }
        })
}
