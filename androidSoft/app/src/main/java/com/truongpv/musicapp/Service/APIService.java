package com.truongpv.musicapp.Service;

public class APIService {
    private static String base_url = "https://truongphanvan.000webhostapp.com/Sever/";
    public static  Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
