# 🚨 Endpoint Threat Detector

A Spring Boot based microservice that monitors basic system metrics and detects potential endpoint threats using a simple rule-based engine.

🔗 **Live Demo:**  
https://endpoint-threat-detector.onrender.com

---

## 📌 Features
- Health check endpoint
- System metrics collection (process count, memory)
- Rule-based threat detection
- REST APIs returning JSON
- Dockerized and deployed on cloud (Render)

---

## 🧠 Architecture Overview

Controller → Service → Rule Engine → Model → JSON Response

- **Controller Layer** – Handles HTTP requests and responses  
- **Service Layer** – Contains business logic  
- **Rule Engine** – Pluggable rules for threat detection  
- **Model Layer** – Plain Java objects  
- **Docker + Cloud** – Containerized and deployed publicly  

---

## 🔗 API Endpoints

```http
GET /health
GET /metrics
GET /threats

```
## 🛠 Tech Stack
- Java 17
- Spring Boot
- Maven
- Docker
- Render (Cloud Deployment)

---

## 🚀 How to Run Locally
```bash
     mvn clean spring-boot:run
```md
http://localhost:8080

## 📦 Deployment

The application is containerized using Docker and deployed on Render.
Each GitHub push triggers an automatic build and redeployment.

## 👨‍💻 Author

Vansh Sharma