package com.example.repositories

import com.example.entities.Book
import jakarta.inject.Singleton

@Singleton
class BookRepository {
    fun allBooks(): List<Book> = listOf(
        Book(id = "1", name = "One", authorId = "1"),
        Book(id = "2", name = "Two", authorId = "2"),
        Book(id = "3", name = "Three", authorId = "1"),
        Book(id = "4", name = "Four", authorId = "2"),
        Book(id = "5", name = "Five", authorId = "1"),
        Book(id = "6", name = "Six", authorId = "2"),
        Book(id = "7", name = "Seven", authorId = "1"),
    )
}