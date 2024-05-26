# dataloaders

This is an example repository showing problems of using `@RequestScope`
with [Micronaut](https://micronaut.io/) and [graphql-kotlin](https://opensource.expediagroup.com/graphql-kotlin/docs/). Issue raised on [GitHub](https://github.com/micronaut-projects/micronaut-graphql/issues/483).



TL;DR

1. start the server
2. run the query:
    ```graphql
    query MyQuery {
      authors {
        id
      }
    }
    ```
3. observe result returned
4. change the query to:
    ```graphql
    query MyQuery {
      books {
        id
        author {
          id
        }
      }
    }
    ```
5. Observe: request fails with error 
```Exception while fetching data (/books[1]/author) : No request present```


Initial debugging shows problems with using `@RequestScope` when accessing calling
field resolvers on >2 level of the query.

