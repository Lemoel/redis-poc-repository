package com.poc.redis.resource

import com.poc.redis.entity.Student
import com.poc.redis.service.StudentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/v1/students")
class StudentResource(
    val studentService: StudentService,
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody student: Student): Student {
        return studentService.save(student)
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun find(@PathVariable id: UUID): Student {
        return studentService.findById(id)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun delete(@PathVariable id: UUID) {
        studentService.deleteById(id)
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun findAll() = studentService.findAll()

}