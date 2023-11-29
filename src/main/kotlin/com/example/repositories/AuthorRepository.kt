package com.example.repositories

import com.example.entities.Author
import jakarta.inject.Singleton

@Singleton
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