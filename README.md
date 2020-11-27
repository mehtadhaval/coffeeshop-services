# Coffeeshop Services

This project contains backend services for a Coffeeshop. 

## Architecture

Header over to `docs` directory
  
## Security

- Auth service acts as OAuth2 Authorization Server and issues JWT tokens

## Build

- It is a maven multi-module project
- Each module is a spring-boot based microservice

Build all the modules
```
./mvnw clean package -DskipTests
```

## Run

- Uses `docker-compose` for local environment setup

Run all the services
```
docker-compose up --build -d
```