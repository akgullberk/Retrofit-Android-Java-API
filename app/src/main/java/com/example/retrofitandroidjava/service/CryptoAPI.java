package com.example.retrofitandroidjava.service;

import com.example.retrofitandroidjava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("/economy/cripto")
    Call<List<CryptoModel>> getData();

}