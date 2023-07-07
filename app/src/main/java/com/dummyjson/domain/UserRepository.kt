package com.dummyjson.domain

interface UserRepository {

    suspend fun getUsers(): List<User>

    suspend fun getUserById(id: Int): User?
}