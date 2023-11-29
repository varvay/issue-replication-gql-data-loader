package com.example.dataloaders

import com.expediagroup.graphql.dataloader.KotlinDataLoaderRegistryFactory
import io.micronaut.context.annotation.Factory
import io.micronaut.runtime.http.scope.RequestScope
import org.dataloader.DataLoaderRegistry

@Factory
class DataLoaderRegistryFactory(private val authorDataLoader: AuthorDataLoader) {

    @RequestScope
    fun dataLoaderRegistry(): DataLoaderRegistry {
        println("requested registry")
        val registryFactory = KotlinDataLoaderRegistryFactory(authorDataLoader)
        return registryFactory.generate()
    }
}