package com.ozgenurbilican.messagingapp

data class Message(
    val content: String,
    val isUserMessage: Boolean,
    val isAutoReply: Boolean = false
)
