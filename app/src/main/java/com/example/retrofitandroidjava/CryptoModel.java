package com.example.retrofitandroidjava;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    String currency;

    @SerializedName("pricestr")
    String pricestr;
}
