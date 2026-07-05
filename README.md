```markdown
# CRM Application

A professional Customer Relationship Management (CRM) system built with **Java** and **Spring Boot**. This application is designed to manage customer data efficiently using a clean MVC (Model-View-Controller) architecture.

## 🚀 Technologies Used
* **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate
* **Frontend:** Thymeleaf, HTML, CSS
* **Database:** MySQL
* **Build Tool:** Maven

## ✨ Key Features
* **Full CRUD Operations:** Seamlessly add, update, delete, and search customer records.
* **MVC Architecture:** Clean separation of concerns using Controller, Service, and Repository layers.
* **Dynamic UI:** Server-side rendered interface using Thymeleaf.
* **Data Persistence:** Efficiently managed through MySQL and Hibernate.
* **Robustness:** Built-in form validation and exception handling for a smooth user experience.

## 📋 Prerequisites
Ensure you have the following installed on your system:
* [JDK 17+](https://adoptium.net/)
* [MySQL Server](https://dev.mysql.com/downloads/mysql/)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/)
* [Maven](https://maven.apache.org/)

## 🛠️ Setup Instructions

### 1. Clone the Repository
```bash
git clone [https://github.com/prakasharm123/CRM-WebApp.git](https://github.com/prakasharm123/CRM-WebApp.git)
cd CRM-WebApp

```

### 2. Database Setup

1. Create a database in MySQL:
`CREATE DATABASE your_db_name;`
2. Update your database configuration in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

```



### 3. Running the Application

1. Open the project in IntelliJ IDEA.
2. Let Maven download the dependencies.
3. Run the main application file (usually named `CrmApplication.java`).
4. Access the application in your browser at `http://localhost:8080`.

## 💡 Contribution

Contributions are welcome! Please feel free to open a Pull Request for any improvements or bug fixes.

---

*Developed by Prakash Sharma*

```

