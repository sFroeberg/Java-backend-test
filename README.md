# Java Backend RESTful API

A professional Spring Boot application demonstrating RESTful API development with modern Java practices. This project showcases clean architecture, proper validation, and comprehensive CRUD operations.

## 🚀 Live Demo
- API Base URL: `http://localhost:8080/api`
- H2 Database Console: `http://localhost:8080/h2-console`

## 🛠️ Technologies Used
- **Java 17** - Modern Java features and performance
- **Spring Boot 3.1.5** - Enterprise-grade framework
- **Spring Data JPA** - Data persistence and ORM
- **H2 Database** - In-memory database for development
- **Maven** - Dependency management and build tool
- **Bean Validation** - Input validation and data integrity

## Features

- RESTful API endpoints for CRUD operations
- Spring Boot 3.1.5 with Java 17
- JPA/Hibernate for data persistence
- H2 in-memory database for development
- Input validation with Bean Validation
- Cross-origin resource sharing (CORS) enabled

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Getting Started

### 1. Clone and Navigate to Project
```bash
cd java-backend
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### User Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/users` | Get all users |
| GET | `/api/users/{id}` | Get user by ID |
| GET | `/api/users/email/{email}` | Get user by email |
| POST | `/api/users` | Create new user |
| PUT | `/api/users/{id}` | Update user |
| DELETE | `/api/users/{id}` | Delete user |

### Example API Usage

#### Create a User

**PowerShell (Windows):**
```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/users" -Method POST -ContentType "application/json" -Body '{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "bio": "Software Developer"
}'
```

**cURL (Bash/Linux/Git Bash):**
```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "bio": "Software Developer"
  }'
```

#### Get All Users

**PowerShell:**
```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/users" -Method GET
```

**cURL:**
```bash
curl http://localhost:8080/api/users
```

#### Get User by ID

**PowerShell:**
```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/users/1" -Method GET
```

**cURL:**
```bash
curl http://localhost:8080/api/users/1
```

#### Update User

**PowerShell:**
```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/users/1" -Method PUT -ContentType "application/json" -Body '{
  "name": "John Smith",
  "email": "john.smith@example.com",
  "bio": "Senior Software Developer"
}'
```

**cURL:**
```bash
curl -X PUT http://localhost:8080/api/users/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Smith",
    "email": "john.smith@example.com",
    "bio": "Senior Software Developer"
  }'
```

#### Delete User

**PowerShell:**
```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/users/1" -Method DELETE
```

**cURL:**
```bash
curl -X DELETE http://localhost:8080/api/users/1
```

## Database

The application uses H2 in-memory database for development. You can access the H2 console at:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)

## Project Structure

```
src/
├── main/
│   ├── java/com/example/javabackend/
│   │   ├── controller/          # REST controllers
│   │   ├── model/              # Entity classes
│   │   ├── repository/         # Data access layer
│   │   ├── service/            # Business logic layer
│   │   └── JavaBackendApplication.java
│   └── resources/
│       └── application.properties
└── test/                       # Test files
```

## Configuration

Key configuration properties in `application.properties`:
- Server port: `8080`
- Database: H2 in-memory
- JPA: Auto-create tables on startup
- Logging: Debug level for application packages

## Development

### Adding New Entities

1. Create entity class in `model` package
2. Create repository interface in `repository` package
3. Create service class in `service` package
4. Create controller class in `controller` package

### Testing

Run tests with:
```bash
mvn test
```

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/example/javabackend/
│   │   ├── controller/          # REST controllers
│   │   ├── model/              # Entity classes
│   │   ├── repository/         # Data access layer
│   │   ├── service/            # Business logic layer
│   │   └── JavaBackendApplication.java
│   └── resources/
│       └── application.properties
└── test/                       # Test files
```

## 🎯 Key Features Demonstrated

- **Clean Architecture**: Separation of concerns with controller, service, and repository layers
- **RESTful Design**: Proper HTTP methods and status codes
- **Data Validation**: Bean Validation annotations for input validation
- **Error Handling**: Comprehensive error responses with meaningful messages
- **Database Integration**: JPA/Hibernate with repository pattern
- **Documentation**: Comprehensive API documentation and examples

## 🔧 Production Considerations

For production deployment:
1. Replace H2 with a production database (PostgreSQL, MySQL, etc.)
2. Update `application.properties` with production database configuration
3. Add security configuration (Spring Security)
4. Add proper error handling and logging
5. Configure environment-specific profiles

## 👨‍💻 About This Project

This project demonstrates proficiency in:
- Modern Java development practices
- Spring Boot framework ecosystem
- RESTful API design principles
- Database design and JPA
- Maven build management
- Git version control
