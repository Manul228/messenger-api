package com.example.messenger.api.components

import com.example.messenger.api.constants.ErrorResponse
import com.example.messenger.api.constants.ResponseConstants

import com.example.messenger.api.exceptions.MessageEmptyException
import com.example.messenger.api.exceptions.MessageRecipientInvalidException

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler


@ControllerAdvice
class MessageControllerAdvice {
}