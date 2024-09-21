# Spring Layers with Hibernate

This project demonstrates the integration of Spring Framework layers with Hibernate for database persistence. The application follows a layered architecture, ensuring a clean separation of concerns between presentation, business logic, and data access layers.

## Features
- Full CRUD operations using Hibernate ORM
- Layered architecture with clear separation of responsibilities
- Integrated persistence management using Hibernate and Spring Data JPA
- MySQL database integration

## Architecture Overview

### 1. Controller Layer (Presentation Layer)
- Manages incoming HTTP requests.
- Acts as the interface between the client and the service layer.
- Uses Spring’s `@Controller` or `@RestController` annotations.

### 2. Service Layer (Business Logic Layer)
- Contains the business logic of the application.
- Interacts with the data access layer to perform operations on the database.
- Uses Spring’s `@Service` annotation.

### 3. Repository Layer (Data Access Layer)
- Handles database interaction using Hibernate.
- Uses Spring Data JPA for simplifying database access and ORM operations.
- Defined using `@Repository`.

### 4. Entity Layer
- Contains the entity classes that map to the database tables.
- Uses JPA annotations for object-relational mapping.

## Hibernate Persistence Configuration
- Hibernate is used as the ORM tool for mapping Java objects to relational database tables.
- Persistence is configured via the `persistence.xml` file or via Spring’s `application.properties` or `application.yml`.

## Dependencies (pom.xml)
Key dependencies in `pom.xml` include:
- **Spring Boot Starter Web**: For building web applications, including RESTful services.
- **Spring Boot Starter Data JPA**: For integrating JPA and Hibernate ORM.
- **MySQL Connector**: For connecting to the MySQL database.
- **Hibernate Core**: For ORM operations.
- **Spring Boot Starter Test**: For testing the application.

```xml
<dependencies>
    <!-- Spring Boot and Web dependencies -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA with Hibernate -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL Driver -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Hibernate Core -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
    </dependency>

    <!-- Spring Boot Testing -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
