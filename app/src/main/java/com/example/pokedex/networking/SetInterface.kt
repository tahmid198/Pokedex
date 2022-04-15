package com.example.pokedex.networking

import com.example.pokedex.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface SetInterface {
    @GET("sets")
    fun getData(): Call<Pokemon>
}