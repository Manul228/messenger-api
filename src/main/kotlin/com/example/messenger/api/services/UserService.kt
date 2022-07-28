package com.example.messenger.api.services

import com.example.messenger.api.models.User

interface UserService {
    fun attemptRegistration(userDetails: User): User

    fun listUsers(currentUser: User): List<User>

    fun retreiveUserData(username: String): User?

    fun retreiveUserData(id: Long): User?

    fun usernameExists(username: String): Boolean
}