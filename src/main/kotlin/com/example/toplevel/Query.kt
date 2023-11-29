package com.example.toplevel

import com.example.entities.Author
import com.example.entities.Book
import com.example.repositories.AuthorRepository
import com.example.repositories.BookRepository
import jakarta.inject.Singleton

@Singleton
class Query(private val bookRepository: BookRepository, private val authorRepository: AuthorRepository) {
    fun books(): List<Book> = bookRepository.allBooks()
    fun authors(): List<Author> = authorRepository.allAuthors()
}