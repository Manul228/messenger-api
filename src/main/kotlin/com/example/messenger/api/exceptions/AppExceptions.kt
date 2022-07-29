package com.example.messenger.api.exceptions


class UsernameUnavailableException(override val message: String): RuntimeException()

class UserStatusEmptyException(override val message: String): RuntimeException()

class InvalidUserIdException(override val message: String): RuntimeException()

class MessageEmptyException(override val message: String = "A message cannot ve empty."): RuntimeException()

