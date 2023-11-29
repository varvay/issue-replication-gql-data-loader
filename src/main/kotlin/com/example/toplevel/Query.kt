package com.example.toplevel

import com.example.entities.Book
import com.example.repositories.BookRepository
import jakarta.inject.Singleton

@Singleton
class Query(private val bookRepository: BookRepository) {
    fun books(): List<Book> = bookRepository.allBooks()
}