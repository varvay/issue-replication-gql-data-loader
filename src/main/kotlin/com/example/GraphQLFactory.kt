package com.example

import com.example.toplevel.Query
import com.expediagroup.graphql.generator.SchemaGeneratorConfig
import com.expediagroup.graphql.generator.TopLevelObject
import com.expediagroup.graphql.generator.toSchema
import graphql.GraphQL
import graphql.schema.GraphQLSchema
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.core.io.ResourceResolver
import jakarta.inject.Singleton


@Factory
class GraphQLFactory(private val query: Query) {

    @Bean
    @Singleton
    fun graphQL(resourceResolver: ResourceResolver): GraphQL {
        val config = SchemaGeneratorConfig(
            listOf("com.example"),
        )
        val queries = listOf(TopLevelObject(query))
        val schema: GraphQLSchema = toSchema(config, queries)
        return GraphQL
            .Builder(schema)
            .build()
    }
}