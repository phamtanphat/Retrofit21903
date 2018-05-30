package com.ptp.phamtanphat.retrofit21903.Service;

/**
 * Created by KhoaPhamPC on 30/5/2018.
 */

public class RetrofitAPI {
    public static final String url = "https://khoapham.vn/KhoaPhamTraining/json/tien/";

    public static DataAPI getData(){
        return RetrofitInit.getclient(url).create(DataAPI.class);
    }
}

