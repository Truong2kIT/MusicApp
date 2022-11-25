package com.truongpv.myappmusic.Service;

public class APIService {
    private static String base_url = "https://truongphanvan.000webhostapp.com/Sever/";
    public static  DataService getService(){
        return APIRetrofitClient.getClient(base_url).create(DataService.class);
    }
}