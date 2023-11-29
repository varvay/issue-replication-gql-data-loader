package com.example.repositories

import com.example.entities.Book
import jakarta.inject.Singleton

@Singleton
class BookRepository {
    fun allBooks(): List<Book> = listOf(
        Book(id = "1", name = "One"),
        Book(id = "2", name = "Two"),
        Book(id = "3", name = "Three"),
        Book(id = "4", name = "Four"),
        Book(id = "5", name = "Five"),
        Book(id = "6", name = "Six"),
        Book(id = "7", name = "Seven"),
    )
}