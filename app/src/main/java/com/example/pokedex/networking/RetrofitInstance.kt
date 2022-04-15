package com.example.pokedex.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL: String = "https://api.pokemontcg.io/v2/"

    private var retrofitInstance: Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

    fun getRetrofitInstance(): Retrofit {
        return retrofitInstance
    }
}
