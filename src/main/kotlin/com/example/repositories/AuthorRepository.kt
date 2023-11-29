package com.example.repositories

import com.example.entities.Author
import jakarta.inject.Singleton

@Singleton
class AuthorRepository {
    fun allAuthors(): List<Author> = listOf(
        Author(id = "1", name = "Tolkien"),
        Author(id = "2", name = "Rowling"),
    )
}