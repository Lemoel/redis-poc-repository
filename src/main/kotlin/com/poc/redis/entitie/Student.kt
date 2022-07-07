package com.poc.redis.entitie

import org.springframework.data.redis.core.RedisHash
import java.util.UUID

@RedisHash("Student")
class Student(
    val id: UUID? = UUID.randomUUID(),
    val name: String
)