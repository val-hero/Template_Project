package com.dummyjson.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    const val baseUrl: String = "https://jsonplaceholder.typicode.com"

    private val client = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = client.create(UserApiService::class.java)
}