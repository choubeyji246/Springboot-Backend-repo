🌱 Spring Boot Learning Journey

This repository is a hands-on project built to learn and implement major Spring Boot concepts — from the basics of CRUD operations to advanced topics like authentication, Redis caching, security, and deployment.

🚀 Project Overview

This project serves as a complete learning guide for building scalable and secure RESTful applications using Spring Boot.
Each module introduces a new concept and demonstrates its implementation with real code examples, best practices, and project-based learning.

🧩 Tech Stack

Backend: Spring Boot, Java
Database: MongoDB / MySQL (configurable)
Caching: Redis
Security: Spring Security, JWT Authentication
Build Tool: Maven
Deployment: Docker, AWS / Render / Railway
Testing: JUnit, Postman
Version Control: Git & GitHub

📚 Learning Modules
1. 🏗️ Project Setup

Creating Spring Boot project using Spring Initializr

Understanding folder structure

Configuring application.properties / application.yml

Setting up dependencies (Spring Web, JPA, MongoDB, Security, etc.)

2. 🔁 CRUD Operations

Building REST APIs (GET, POST, PUT, DELETE)

Entity, Repository, Service, and Controller layers

Exception handling and validation

Integration with MongoDB / MySQL

3. 🔐 Authentication & Authorization

Spring Security setup

JWT (JSON Web Token) based authentication

Role-based access control

User registration and login endpoints

4. ⚡ Redis Caching

Introduction to Redis and caching concepts

Integrating Redis with Spring Boot

Implementing caching for GET APIs

Cache eviction and TTL configuration

5. 🧠 Error Handling & Logging

Global exception handling using @ControllerAdvice

Custom error responses

Logging using SLF4J and Logback

6. 🧪 Testing & API Documentation

Writing unit tests using JUnit & Mockito

Testing APIs with Postman / cURL

Integrating Swagger / SpringDoc for API documentation

7. ☁️ Deployment

Creating JAR file with Maven

Running application locally and on server

Dockerizing Spring Boot app

Deploying to AWS EC2 / Render / Railway

🗄️ Database Configurations

Switch easily between MongoDB and MySQL:

For MongoDB: use spring.data.mongodb.uri

For MySQL: use spring.datasource.url, username, password



🧰 How to Run

Clone the repo:

git clone https://github.com/yourusername/springboot-learning.git
cd springboot-learning


Build and run:

mvn clean install
mvn spring-boot:run


Access API:

http://localhost:8080/
