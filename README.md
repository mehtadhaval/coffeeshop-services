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

## Test

Run the Postman collection available at `test/Coffeeshop_Order_Flow.postman_collection.json`

## Swagger Docs

Swagger docs are available at http://localhost:8080/v2/api-docs

## Roadmap

### Functional

- Support for capturing Payments from Customer
- Support for Discount Coupons
- Support for customizing menu
- Support for configuring fixed charges per order (takeway charge, etc)

### Technical
- Implement all the microservices (`OrderService`, `CustomerService`, `ShopService`)
- Setup API gateway and service discovery for inter-service communication
- Unit tests
- CI pipeline
