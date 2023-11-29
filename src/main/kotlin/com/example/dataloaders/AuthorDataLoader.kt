package com.example.dataloaders

import com.example.entities.Author
import com.example.repositories.AuthorRepository
import com.expediagroup.graphql.dataloader.KotlinDataLoader
import jakarta.inject.Singleton
import org.dataloader.DataLoader
import org.dataloader.DataLoaderFactory
import java.util.concurrent.CompletableFuture

@Singleton
class AuthorDataLoader(private val authorRepository: AuthorRepository): KotlinDataLoader<String, Author> {
    override val dataLoaderName = "AuthorDataLoader"
    override fun getDataLoader(): DataLoader<String, Author> {
        println("get dataloader")
        val loader = DataLoaderFactory.newDataLoader { ids ->
            println("data loader: fetch ids ${ids}")
            CompletableFuture.supplyAsync {
                ids.map { id -> authorRepository.getAuthor(id) }
            }
        }
        return loader
    }
}