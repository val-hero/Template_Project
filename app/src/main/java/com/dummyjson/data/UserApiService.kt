package com.dummyjson.data

import retrofit2.http.GET
import retrofit2.http.Query

interface UserApiService {

    @GET("/users")
    suspend fun getUsers(): UserList

    @GET("/users{id}")
    suspend fun getUserById(@Query("id") id: Int): UserDto?
}