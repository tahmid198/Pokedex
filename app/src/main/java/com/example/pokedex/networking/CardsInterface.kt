package com.example.pokedex.networking

import com.example.pokedex.model.Data
import com.example.pokedex.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CardsInterface {
      @GET("cards")
      fun getData(): Call<Pokemon>

      @GET("cards/{id}")
      fun getPokemonById(
            @Query("id") id: String
      ): Call<Data>
}

//@Headers("X-Api-Key:71586cb4-235f-44e1-9709-016705440b24")
//suspend fun getPokemonImages(): Response<List<Images>> // prepend with suspend to network request happens asyc and not on main thread; lets Coroutines library do the work
