package com.example.dataloaders

import com.expediagroup.graphql.dataloader.KotlinDataLoaderRegistryFactory
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.runtime.http.scope.RequestScope
import jakarta.inject.Singleton
import org.dataloader.DataLoaderRegistry

@Factory
class DataLoaderRegistryFactory(private val authorDataLoader: AuthorDataLoader) {

//    @RequestScope
    @Bean
//    @Singleton
    fun dataLoaderRegistry(): DataLoaderRegistry {
        println("requested registry")
        val registryFactory = KotlinDataLoaderRegistryFactory(authorDataLoader)
        return registryFactory.generate()
    }
}