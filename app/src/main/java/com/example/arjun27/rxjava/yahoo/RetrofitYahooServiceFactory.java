package com.example.arjun27.rxjava.yahoo;

import com.example.arjun27.rxjava.GETAPI;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitYahooServiceFactory {
    String API_BASE_URL = "https://jsonplaceholder.typicode.com";
    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY);

    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
    Retrofit retrofit = new Retrofit.Builder()
            .client(client)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(API_BASE_URL)
            .build();

    public YahooService create() {
        return retrofit.create(YahooService.class);
    }

    public GETAPI getapicreate(){
        return retrofit.create(GETAPI.class);
    }

}
