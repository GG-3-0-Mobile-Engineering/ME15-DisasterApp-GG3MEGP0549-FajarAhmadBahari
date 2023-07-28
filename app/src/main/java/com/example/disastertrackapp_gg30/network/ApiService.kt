package com.example.disastertrackapp_gg30.network

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("reports")
    suspend fun getDisasterReports(): Response<ApiResult>
}
