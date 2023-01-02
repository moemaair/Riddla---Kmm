package com.moemaair.riddla

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform