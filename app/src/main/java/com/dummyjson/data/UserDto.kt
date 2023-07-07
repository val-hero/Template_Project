package com.dummyjson.data

import com.dummyjson.domain.User

data class UserDto(
    val id: Int,
    val name: String,
    val email: String
)

fun UserDto.mapToDomainModel(): User {
    return User(
        id = this.id,
        name = this.name,
        email = this.email
    )
}