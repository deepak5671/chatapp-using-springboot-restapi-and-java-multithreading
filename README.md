# chatapp-using-springboot-restapi-and-java-multithreading


Project Description: Chat Application (Backend Only): 
This is a backend-only Chat Application built using Java Multithreading, REST APIs, JPA, MVC architecture, and MySQL database.
The application enables sending and receiving chat messages through Postman without any frontend interface. 
It focuses on concurrency, scalability, and clean backend design.

Key Features
- Multithreading Support:
- Handles multiple users simultaneously.
- Ensures smooth message delivery without blocking.
- RESTful APIs:
- Endpoints for sending and receiving chat messages.
- JSON-based request/response format for easy integration.
- Database Integration (MySQL + JPA):
- Stores chat messages with sender/receiver details and timestamps.
- Uses JPA for ORM, ensuring clean and efficient database operations.
- MVC Architecture:
- Clear separation of Controller, Service, and Repository layers.
- Improves maintainability and scalability.
- Postman Testing:
- All chat operations (send/receive) tested via Postman.
- No frontend required — purely backend-driven communication.
- 
 Tech Stack
- Language: Java
- Frameworks: Spring Boot (REST API, MVC)
- Database: MySQL
- ORM: JPA/Hibernate
- Tools: Postman (API testing)
- 
  Example API Endpoints
- POST http://<server ip>:6400/chat/send → Send a new message

- GET http://<server ip>:6400/chat/send/messages → Retrieve chat history

