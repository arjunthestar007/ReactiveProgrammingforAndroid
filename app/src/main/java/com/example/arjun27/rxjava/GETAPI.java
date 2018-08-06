package com.example.arjun27.rxjava;

import java.util.List;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GETAPI {

    @GET("/posts")
    Single<List<Category>> getapi();

    @GET("/posts?id=30")
    Call<List<Category>> getapistatc();


    @GET("/posts")
    Call<List<Category>> getapiquery(@Query("id") String id);


    // multiple query param
    @GET("/posts")
    Call<List<Category>> getapimultiplequery(@Query("id") String id, @Query("userId") String userid);




    // raw response from okhttp
    @GET("/posts")
    Call<ResponseBody> getresponse();





}
