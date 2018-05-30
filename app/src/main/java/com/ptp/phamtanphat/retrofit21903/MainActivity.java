package com.ptp.phamtanphat.retrofit21903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ptp.phamtanphat.retrofit21903.Service.DataAPI;
import com.ptp.phamtanphat.retrofit21903.Service.RetrofitAPI;
import com.ptp.phamtanphat.retrofit21903.Service.RetrofitInit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        DataAPI dataAPI = RetrofitAPI.getData();
//        Call<Demo1> callback = dataAPI.getDataDemo1();
//        callback.enqueue(new Callback<Demo1>() {
//            @Override
//            public void onResponse(Call<Demo1> call, Response<Demo1> response) {
//                Demo1 demo1 = response.body();
//                Log.d("BBB",demo1.getFanpage());
//            }
//
//            @Override
//            public void onFailure(Call<Demo1> call, Throwable t) {
//                Log.d("BBB",t.getMessage());
//            }
//        });
        DataAPI dataAPI = RetrofitAPI.getData();
        Call<Demo2> callback = dataAPI.getDataDemo2();
        callback.enqueue(new Callback<Demo2>() {
            @Override
            public void onResponse(Call<Demo2> call, Response<Demo2> response) {
                Demo2 demo2 = response.body();
                Log.d("BBB",demo2.getDanhsach().get(0).getKhoahoc());
            }

            @Override
            public void onFailure(Call<Demo2> call, Throwable t) {

            }
        });
    }
}
