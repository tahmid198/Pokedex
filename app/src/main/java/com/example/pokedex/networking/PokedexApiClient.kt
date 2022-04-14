package com.example.pokedex.networking

import com.example.pokedex.models.Data
import com.example.pokedex.models.Images
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.Callback
import retrofit2.Response
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

private const val API_KEY = "71586cb4-235f-44e1-9709-016705440b24"


class pokedexApiManager {
     private lateinit var pokedexService:PokedexService

     init {
          val retrofit = Retrofit.Builder()
               .baseUrl("https://api.pokemontcg.io")
               .addConverterFactory(GsonConverterFactory.create())
               .build()
          pokedexService = retrofit.create(PokedexService::class.java)
     }
     fun getPokemonImageList(pokemonListResponse:Callback<List<Images>>) {
          val current = pokedexService.getPokemonImages(API_KEY)
          current?.enqueue(object : Callback<List<Images?>> {
               override fun onResponse(call: Call<List<Images?>>, response: Response<List<Images?>>) {
                    val model = response.body()
                    val pokemons = model?.Images
               }

               override fun onFailure(call: Call<List<Images?>>, t: Throwable) {
                    TODO("Not yet implemented")
               }

          })


     }

}


