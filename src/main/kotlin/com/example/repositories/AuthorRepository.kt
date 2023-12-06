package com.example.repositories

import com.example.entities.Author
import io.micronaut.context.annotation.Bean
import io.micronaut.runtime.http.scope.RequestScope
import jakarta.inject.Singleton

// this works with Bean or Singleton but not with request
//@Singleton
@RequestScope
//@Bean
class AuthorRepository {

    private val authors = mapOf(
        "1" to Author(id = "1", name = "Tolkien"),
        "2" to Author(id = "2", name = "Rowling"),
    )

    fun allAuthors(): List<Author> = authors.values.toList()
    fun getAuthor(id: String): Author {
        println("author registry: get by id ${id}")
        return authors[id]!!
    }
}