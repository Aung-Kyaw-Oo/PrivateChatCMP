package com.black.diamond.ako.private_chat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform