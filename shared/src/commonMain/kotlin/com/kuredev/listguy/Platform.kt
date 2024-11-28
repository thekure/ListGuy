package com.kuredev.listguy

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform