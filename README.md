## Swagger ui
http://localhost:8080/swagger-ui.html

## OpenAPI specification generation
`./gradlew clean generateOpenApiDocs`
Note. plugin used for generation -> https://github.com/springdoc/springdoc-openapi-gradle-plugin

## OpenAPI client generation
`./gradlew openApiGenerate`
https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin

## Build and dockerify
Note. Github actions are taking care of it.  
`./gradlew build`  
`docker build -t amartiushov/sut:v1 .`  
`docker push amartiushov/sut:v1`

## Create and push a tag
`git tag v1.0; git push origin --tags`


