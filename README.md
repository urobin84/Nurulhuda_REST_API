# Nurulhuda REST API
REST API Yayasan Yatim Nurulhuda dengan Spring Boot Application.

### URL

* [/api/auth/signup](#)
* [/api/auth/signin](#)
* [/api/users](#)
* [/api/users/{id}](#)

### Run
*[ spring-boot:run ]*

### Database
MYSQL

### application.properties

>spring.datasource.url= jdbc:mysql://localhost:3306/nurulhuda_db?useSSL=false
>spring.datasource.username= root
>spring.datasource.password=
>spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
>spring.jpa.hibernate.ddl-auto= update
>//# App Properties
>nurulhuda.app.jwtSecret= alhsdfakdvajsdhvkafjvskdfhaksjdhvfa
>nurulhuda.app.jwtExpirationMs= 360000
>springdoc.swagger-ui.path=/swagger-ui.html

### Dependency
* spring-boot-starter-data-jpa
* spring-boot-starter-security
* spring-boot-starter-validation
* spring-boot-starter-hateoas
* spring-boot-starter-web
* jjwt
* mysql-connector-java
* springdoc-openapi-ui
* springdoc-openapi-security

