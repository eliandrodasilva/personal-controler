# Java + MySQL Integration using XAMPP

This project demonstrates how to integrate a Java application (using Maven) with a MySQL database via XAMPP. The database is managed through phpMyAdmin, and the Java persistence is configured using `persistence.xml`.

---

## 🔧 Prerequisites

- XAMPP
- Java (JDK 8 or higher)
- Maven
- IntelliJ IDEA (or any preferred Java IDE)

---

## 🚀 Getting Started

### 1. Start XAMPP Services

1. Open the XAMPP Control Panel.
2. Start **Apache** and **MySQL** services.

> ✅ Make sure both services are running (green indicators).

---

### 2. Create a MySQL Database using phpMyAdmin

1. Open a browser and go to:  
   [`http://localhost/phpmyadmin`](http://localhost/phpmyadmin)
2. Click on **Databases** in the top menu.
3. Enter a database name (e.g., `app`) and click **Create**.

---

### 3. Configure Persistence in `persistence.xml`

Navigate to:  
`src/main/resources/META-INF/persistence.xml`

Update the database configuration as follows:

```xml
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" version="2.2">
    <persistence-unit name="persistenciaPU">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <properties>

            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:5244/app?useSSL=false"/>
            <property name="javax.persistence.jdbc.user" value="root"/>
            <property name="javax.persistence.jdbc.password" value=""/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>
            <property name="hibernate.hbm2ddl.auto" value="update"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.format_sql" value="true"/>
            <property name="hibernate.connection.pool_size" value="10"/>

        </properties>
    </persistence-unit>
</persistence>
```
## 💡 Replace:

In ```javax.persistence.jdbc.url```: change ```app``` with your actual DB name

In ```javax.persistence.jdbc.user``` and ```javax.persistence.jdbc.password```: change the ```host``` number, ```root``` and ```""``` with your MySQL host/username/password (as set in XAMPP)

---

### 4. Build and Run the Java Application
Make sure your Maven project is properly set up.

Run your Java code from your IDE or using the terminal (the following line is also used to update depedencies from mavem pom.xml):


```
mvn clean install
```
The application will connect to the MySQL database and perform data operations via JPA (Hibernate).

---

## 🛠 Technologies Used

- Java  
- Maven  
- MySQL  
- JPA (Hibernate)  
- XAMPP  
- phpMyAdmin  

## 📌 Notes

- Ensure MySQL is running before launching the Java application.  
- You can monitor and manage your database via phpMyAdmin.  
- Database manipulation is handled entirely through Java code using JPA.

---
