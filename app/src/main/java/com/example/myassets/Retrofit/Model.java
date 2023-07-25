package com.example.myassets.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Model {

    //Use https://www.jsonschema2pojo.org/ for making the json file into a model class and:
        //Set Source type: JSON
        //Set Annotation style: Gson

    //Extend Observable Class for Data Binding if needed

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;


    //Empty Constructor is necessary for Retrofit
    public Model() {
    }

    public Model(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
