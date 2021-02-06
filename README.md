## Swagger ui
http://localhost:8080/swagger-ui.html

## OpenAPI specification generation
`./gradlew clean generateOpenApiDocs`
Note. plugin used for generation -> https://github.com/springdoc/springdoc-openapi-gradle-plugin

## OpenAPI client generation
`./gradlew openApiGenerate`
https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin

## Build and dockerify
`./gradlew build`  
`docker build -t amartyushov/sut:v1 .`  
`docker push amartyushov/sut:v1`


