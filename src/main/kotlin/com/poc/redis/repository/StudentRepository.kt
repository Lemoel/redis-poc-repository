package com.poc.redis.repository

import com.poc.redis.entitie.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface StudentRepository : CrudRepository<Student, UUID>