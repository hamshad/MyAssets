package com.example.myassets.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NameDataService {

    // In the @GET(" here is the End-Point URL ")
    @GET("name")
    Call<Model> getName();

    //If you want the End-Point URL than:
        // @GET("products/category/{foo}")
        // Call<Model> getName(@Path("foo") String name);


}
