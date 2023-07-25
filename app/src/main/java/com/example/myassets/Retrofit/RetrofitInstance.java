package com.example.myassets.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    //This method is used if you want to get data from internet only once.
    //If you want to get data multiple times than don't use if condition in getService function


    public static Retrofit retrofit = null;

    public static String BASE_URL = "https://www.api.com/";

    //Singleton pattern used to create instance for retrofit only once
    public static NameDataService getService(){

        //if instance is not created
        if(retrofit == null){

            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        //if instance is created
        return retrofit.create(NameDataService.class);
    }

}