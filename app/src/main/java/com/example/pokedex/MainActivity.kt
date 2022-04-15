package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.pokedex.model.Data
import com.example.pokedex.model.Pokemon
import com.example.pokedex.networking.CardsInterface
import com.example.pokedex.networking.RetrofitInstance
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()
    }

    private fun getData() {
        val retrofitBuilder = RetrofitInstance.getRetrofitInstance().create(CardsInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<Pokemon> {
            override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                Log.d(TAG, response.code().toString())
                // Log.d("MainActivity", "2.0 getFeed > Full json res wrapped in pretty printed gson =>${GsonBuilder().setPrettyPrinting().create().toJson(response.body())}")
                Log.d(TAG, response.body()!!.data[0].name)
                Log.d(TAG, response.body()!!.data[0].id)
            }

            override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                Log.d(TAG, t.message.toString())
            }
        })
    }

    private fun getPokemonById(id: Int) {
        val retrofitBuilder = RetrofitInstance.getRetrofitInstance().create(CardsInterface::class.java)
        val call = retrofitBuilder.getPokemonById("pl3-1")

        call.enqueue(object : Callback<Data?>{
            override fun onResponse(call: Call<Data?>, response: Response<Data?>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<Data?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

    companion object {
        val TAG = "MainActivity"
    }
}