package com.example.toplevel

import com.example.entities.Book
import jakarta.inject.Singleton

@Singleton
class Query {
    fun books(): List<Book> = listOf(Book(name="Hello world"))
}