# SciNexus: Spring Boot Backend for Blog Migration

[![Language](https://img.shields.io/badge/language-Java_25-007396.svg)](https://www.oracle.com/java/)
[![Framework](https://img.shields.io/badge/framework-Spring_Boot_4.0.3-6DB33F.svg)](https://spring.io/projects/spring-boot)

SciNexus is a personal side-project developed for practice and to deepen my knowledge of **Java** and **Spring Boot**. The goal is to recreate the backend logic of an existing blog (currently on Framer) from scratch, providing a robust and scalable architecture.

---

## 🚀 Purpose & Motivation

This project serves as a hands-on learning journey to master modern backend development. By rebuilding the logic of a live blog, I am exploring:
- Deepening expertise in **Java 25** and **Spring Boot 4**.
- Designing and implementing RESTful APIs.
- Managing data persistence and sessions.
- Implementing clean code principles and best practices in the Spring ecosystem.

## 🛠️ Tech Stack

- **Language:** Java 25
- **Framework:** Spring Boot 4.0.3
- **Build Tool:** Maven
- **Database:** H2 (In-memory)
- **Session Management:** Spring Session JDBC

## 📋 Features

### Current
- [x] Initial project structure and configuration.
- [x] Spring Web and H2 integration.
- [x] Spring Session with JDBC persistence.

### Planned
- [ ] REST API for blog posts and categories.
- [ ] User authentication and authorization.
- [ ] Commenting system and user interactions.
- [ ] Backend logic for dynamic content delivery.

## ⚙️ Getting Started

### Prerequisites
- **JDK 25** or higher
- **Maven 3.9+**

### Installation & Running
1. Clone the repository:
   ```bash
   git clone https://github.com/kafuidev/scinexus.git
   cd scinexus
   ```
2. Build the project:
   ```bash
   ./mvnw clean install
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
The server will start at `http://localhost:8080`.

## 🤝 Contributing

This is a personal practice project, but I am open to feedback and suggestions! Feel free to:
- Fork the repository.
- Open issues for bugs or feature ideas.
- Submit pull requests for improvements.

## 📜 License

This project is open-source. You are allowed to view, fork, and use the code for personal learning and educational purposes.

**Commercial use of this code is strictly prohibited.**

---
*Created with ❤️ by [Kafui Homevo](https://github.com/kafuidev)*

