package com.example.mictest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform