package com.poc.redis.service

import com.poc.redis.entity.Student
import com.poc.redis.repository.StudentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentService(val studentRepository: StudentRepository) {

    fun save(student: Student): Student = studentRepository.save(student)

    fun findById(id: UUID): Student =
        studentRepository.findById(id).orElseThrow { IllegalStateException("Student $id not found") }

    fun deleteById(id: UUID) = studentRepository.deleteById(id)

    fun findAll() = studentRepository.findAll()

}