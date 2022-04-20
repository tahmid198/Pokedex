package com.example.pokedex.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val API_KEY = "71586cb4-235f-44e1-9709-016705440b24"


class PokedexApiClient {
     private var retrofitInstance: Retrofit = Retrofit.Builder()
          .addConverterFactory(GsonConverterFactory.create())
          .baseUrl("https://api.pokemontcg.io/v2/")
          .build()

     fun getRetrofitInstance(): Retrofit {
          return retrofitInstance
     }

}


