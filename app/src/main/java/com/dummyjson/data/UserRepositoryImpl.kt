package com.dummyjson.data

import android.util.Log
import com.dummyjson.domain.User
import com.dummyjson.domain.UserRepository

class UserRepositoryImpl : UserRepository {

    override suspend fun getUsers(): List<User> {
        return try {
            val result = RetrofitClient.api.getUsers().users
            if (result.isNullOrEmpty()) {
                Log.e("Api error: ", "Nothing found")
            }
            result.map { it.mapToDomainModel() }
        } catch (e: Exception) {
            Log.e("Api error: ", e.message!!)
            listOf()
        }
    }

    override suspend fun getUserById(id: Int): User? {
        return try {
            val result = RetrofitClient.api.getUserById(id)
            result?.let {
                result.mapToDomainModel()
            }
        } catch (e: Exception) {
            Log.e("Api error: ", e.message!!)
            null
        }
    }

}