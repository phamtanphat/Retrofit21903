package com.ptp.phamtanphat.retrofit21903.Service;

import com.ptp.phamtanphat.retrofit21903.Demo1;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by KhoaPhamPC on 30/5/2018.
 */

public interface DataAPI {

    @GET("demo1.json")
    Call<Demo1> getDataDemo1();
}
