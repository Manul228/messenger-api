package com.example.messenger.api.services

import com.example.messenger.api.models.User
import com.example.messenger.api.models.Message

interface MessageService {
    fun sendMessage(sender: User, recipientId: Long, messageText: String): Message?
}