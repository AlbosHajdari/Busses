package com.example.lenovo.busses.api;


import com.example.lenovo.busses.model.BusesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/v1/buses/")
    Call<BusesResponse> getBuses();
}
//wifi: auk-campus
//pass: ritkosova
