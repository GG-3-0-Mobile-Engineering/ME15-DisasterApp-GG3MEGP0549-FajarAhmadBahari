package com.example.disastertrackapp_gg30

import android.app.Application
import com.example.disastertrackapp_gg30.network.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyApp : Application() {

    lateinit var apiService: ApiService
        private set

    override fun onCreate() {
        super.onCreate()

        setupRetrofit()
    }

    private fun setupRetrofit() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://data.petabencana.id/") // Replace with the base URL of the API
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService = retrofit.create(ApiService::class.java)
    }
}
