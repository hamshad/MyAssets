package com.example.myassets.Retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myassets.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetroActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro);

        //0. Add Retrofit Dependency:
                // implementation 'com.squareup.retrofit2:retrofit:2.9.0'
                // implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        //1. Make Model Class (Class file)
        //2. Data Service Interface (Interface file)
        //3. Retrofit Instance (Class file)
        //4. Call the Data.

        NameDataService getCountryDataService = RetrofitInstance.getService();
        Call<Model> call = getCountryDataService.getName();

        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {

                //response.body contains data that is fetched
                //get the data and use it however you like
                Model model = response.body();

            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {

            }
        });

    }
}