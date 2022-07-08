package com.poc.redis.entitie

import org.springframework.context.annotation.PropertySource
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import java.util.*

@RedisHash("Student")
//@RedisHash("Student", timeToLive = 120)
data class Student(
    val id: UUID? = UUID.randomUUID(),
    val name: String,

    @TimeToLive
    val expiresIn: Long? = 120,
)