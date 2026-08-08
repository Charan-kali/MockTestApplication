# Mock Test Application

A full-stack **Mock Test Application** built using **Spring Boot** for the backend and **React** for the frontend.

## 🚀 Technologies Used

### Backend

* Java
* Spring Boot
* Spring Data JPA
* REST APIs
* Maven
* MySQL

### Frontend

* React
* JavaScript
* HTML
* CSS
* Axios

## 📁 Project Structure

```text
MockTestApplication/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/MockTest/
│       │       ├── controller/
│       │       ├── entity/
│       │       ├── repository/
│       │       └── service/
│       │
│       └── resources/
│           └── application.properties
│
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── App.js
│   │   ├── MockTestList.jsx
│   │   ├── MockTestService.js
│   │   ├── QuestionPanel.js
│   │   └── api.js
│   ├── package.json
│   └── package-lock.json
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## ✨ Features

* Create and manage mock tests
* Manage questions
* Manage options
* REST API based backend
* React-based frontend
* Spring Boot backend integration
* Question panel for displaying test questions

## ⚙️ Backend Setup

Clone the repository:

```bash
git clone https://github.com/Charan-kali/MockTestApplication.git
```

Go to the project directory:

```bash
cd MockTestApplication
```

Run the Spring Boot application:

```bash
mvnw spring-boot:run
```

The backend will start on the configured Spring Boot port.

## 🎨 Frontend Setup

Open another terminal and go to the frontend:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start the React application:

```bash
npm start
```

The frontend will start on the configured React development port.

## 🔗 Backend and Frontend

The React frontend communicates with the Spring Boot backend through REST APIs.

Make sure the Spring Boot backend is running before using features that require backend data.

 Database

Configure your database connection in:

```text
 Main Backend Components

The backend contains controllers for:

* Mock Tests
* Questions
* Options

It also contains corresponding entities, repositories, and service classes.

##  Main Frontend Components

The React application contains components and services for:

* Mock Test List
* Question Panel
* Mock Test API communication
* Application UI

## 👨‍💻 Author

**Charan-kali**

## 📄 License

This project is for educational and development purposes.
