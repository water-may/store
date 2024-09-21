# README for Contact API

## Overview

The Contact API is a Spring Boot-based application designed to manage products within an inventory system. It offers functionalities for creating, retrieving, updating, and deleting product entries. This guide provides instructions on how to set up and run the application locally.

## Prerequisites

Before you can run the application, you need the following installed on your system:
- Java 11 or later
- Maven
- PostgreSQL

## Setup

### Database Configuration

1. Install PostgreSQL and create a database named `contactapi`.
2. Update the `src/main/resources/application.yml` with your database credentials:
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/contactapi
       username: your_username
       password: your_password
   ```

### Building the Application

Run the following command in the root directory of the project to build the application:
```bash
mvn clean install
```

## Running the Application

To start the application, execute:
```bash
java -jar target/contactapi-0.0.1-SNAPSHOT.jar
```
Alternatively, you can run the application directly using Maven:
```bash
mvn spring-boot:run
```

## API Endpoints

The application exposes the following REST endpoints:

- **GET** `/products`: Retrieve all products
- **GET** `/products/{id}`: Retrieve a product by its ID
- **POST** `/products`: Create a new product
- **PUT** `/products/{id}`: Update an existing product
- **DELETE** `/products/{id}`: Delete a product

## Testing

To run the tests, use the following command:
```bash
mvn test
```

## Contributing

Contributions are welcome! For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

The project is licensed under the MIT License - see the `LICENSE` file for details.

## Contact

For any inquiries or issues, please open an issue on the GitHub repository.
