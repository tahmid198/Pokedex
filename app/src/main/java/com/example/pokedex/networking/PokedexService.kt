package com.example.pokedex.networking

import com.example.pokedex.models.Images
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.Call;
import retrofit2.http.Header
import retrofit2.http.Headers

interface PokedexService {

      @GET("/cards") fun getPokemonImages(
            @Header("X-Api-Key") apikey:String?
      ): Call<List<Images?>>?
}

//@Headers("X-Api-Key:71586cb4-235f-44e1-9709-016705440b24")
//suspend fun getPokemonImages(): Response<List<Images>> // prepend with suspend to network request happens asyc and not on main thread; lets Coroutines library do the work
