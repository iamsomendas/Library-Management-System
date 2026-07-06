# 📚 Library Management System

A secure and scalable **Library Management System** built using **Java**, **Spring Boot**, **Spring Security**, **JWT Authentication**, and **PostgreSQL**. The application provides role-based access for **Admin**, **Librarian**, and **Student** users, enabling efficient library operations through RESTful APIs.

---

## 🚀 Features

### Authentication & Authorization

* JWT-based authentication
* Role-based access control using Spring Security
* Secure login and protected API endpoints

### Admin

* Manage librarians and students
* Add, update, delete, and view books
* Monitor library activities

### Librarian

* Add, update, and remove books
* Issue books to students
* Accept returned books
* View issued and available books

### Student

* Register and log in
* Browse available books
* Borrow and return books
* View borrowing history

---

## 🛠️ Tech Stack

| Category        | Technology                                               |
| --------------- | -------------------------------------------------------- |
| Language        | Java 17                                                  |
| Framework       | Spring Boot                                              |
| Security        | Spring Security, JWT                                     |
| Database        | PostgreSQL                                               |
| ORM             | Spring Data JPA, Hibernate                               |
| API Testing     | Postman                                                  |
| Build Tool      | Maven                                                    |
| Version Control | Git                                                      |
| Architecture    | Layered Architecture (Controller → Service → Repository) |

---

## 🔑 Key Features Implemented

* RESTful API development
* CRUD operations for books and users
* JWT Authentication
* Spring Security configuration
* Role-based authorization
* Exception handling using `@ControllerAdvice`
* Request validation
* DTO pattern
* Database integration with PostgreSQL
* API testing using Postman
* Clean layered architecture

---

## 📡 REST APIs

### Authentication

| Method | Endpoint             | Description                        |
| ------ | -------------------- | ---------------------------------- |
| POST   | `/api/auth/register` | Register a new user                |
| POST   | `/api/auth/login`    | Authenticate user and generate JWT |

### Books

| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| GET    | `/api/books`      | Get all books       |
| GET    | `/api/books/{id}` | Get book by ID      |
| POST   | `/api/books`      | Add a new book      |
| PUT    | `/api/books/{id}` | Update book details |
| DELETE | `/api/books/{id}` | Delete a book       |

### Borrowing

| Method | Endpoint               | Description   |
| ------ | ---------------------- | ------------- |
| POST   | `/api/borrow/{bookId}` | Borrow a book |
| POST   | `/api/return/{bookId}` | Return a book |

---

## 🧪 API Testing

All REST APIs were tested using **Postman** by validating:

* Authentication flow
* JWT token generation
* Authorization rules
* Request and response payloads
* CRUD operations
* Error handling
* HTTP status codes

---

## ⚙️ Installation

### Prerequisites

* Java 17+
* Maven
* MySQL
* Git
* Postman

### Clone the Repository

```bash
git clone <repository-url>
cd library-management-system
```

### Configure Database

Update the `application.properties` file with your PostgreSQL credentials.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/librarydb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Build and Run

```bash
mvn clean install
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## 🔐 Security

* JWT Authentication
* Password encryption using BCrypt
* Stateless authentication
* Role-based authorization
* Protected REST endpoints

---

## 📈 Future Enhancements

* Email notifications
* Book reservation system
* Fine calculation
* Swagger/OpenAPI documentation  
* Unit and integration testing 

---

## 👨‍💻 Author

**Somen Das**

* Java Backend Developer 

---

## 📄 License

This project is intended for learning and demonstration purposes.
