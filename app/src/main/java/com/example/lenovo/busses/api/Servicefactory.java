package com.example.lenovo.busses.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Servicefactory {

    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://pribus.appbit.es")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
