package com.example.entities

import graphql.schema.DataFetchingEnvironment
import java.util.concurrent.CompletableFuture

data class Book(val id: String, val name: String, val authorId: String) {
    fun author(dataFetchingEnvironment: DataFetchingEnvironment): CompletableFuture<Author> {
        val loader = dataFetchingEnvironment.getDataLoader<String, Author>("AuthorDataLoader")
        val author = loader.load(authorId)
        return author
    }
}