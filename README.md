# Coffeeshop Services

This project contains backend services for a Coffeeshop. 
- It is a maven multi-module project
- Each module is a spring-boot based microservice 
- Uses `docker-compose` for local environment setup
- Uses PostgreSQL as primary data-store
- Uses Liquibase for bootstrapping database

## Build
Build all the modules
```
./mvnw clean package -DskipTests
```

### Run
Run all the services
```
docker-compose up --build -d
```