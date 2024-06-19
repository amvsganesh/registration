
# Registration

Welcome to Project Name! This project is a Spring Boot application for managing users.

## Prerequisites

- **Java Development Kit (JDK)** version 17 installed.
- **MySQL** installed with username and password set to "root" and "root" respectively. Modify `application.properties` if different credentials are used.
- **Git** for cloning the repository.
- **Postman** for API testing.

## Getting Started

### Clone the Repository

1. Create a new folder and open Git Bash.
2. Clone the repository:
   ```bash
   git clone http://link-to-your-git-repository
**Import and Run in IDE**<br>
1.Open your preferred IDE (e.g., Eclipse, IntelliJ).<br>
2.Import the cloned project into your IDE.<br>
3.Start the Spring Boot application.<br>
### Running the Application
Ensure Java 17 is configured and MySQL is running with username "root" and password "root".<br>
If your MySQL username and password are different, update them in the application.properties file, which looks like this:<br>

**spring.datasource.url = jdbc:mysql://localhost:3306/DATABASENAME** <br>
**spring.datasource.password = YOUR PASSWORD** <br>
**spring.datasource.username = YOUR USERNAME**<br>

### User Registration
To register a user, use the following endpoint:<br>

**POST Method:** http://localhost:8080/api/user/register

**Body (JSON raw):**
 <pre>
  { 
  "username": "ganesh1212","
  password": "GANESH@123",
  "email": "amvsganesh@gmail.com",
  "gender": "male",
  "phonenumber": 7075699899 
  }
 </pre>
 
<h4>Notes:</h4>
 1.Ensure all fields (username, password, email) are unique and not null.<br>
 2 gender is non-unique.<br>
 3. phonenumber can be null but must be unique if provided.<br>
 
### Fetching User Data
To fetch user data using username and password: <br>

**GET Method:** http://localhost:8080/api/user/fetch?username=ganesh1212&password=GANESH123 <br>

**Notes:** <br>
Replace username and password with your registered credentials.<br>
 ### Additional Notes
 1 .Frontend: Since there is no frontend, use Postman for API testing.<br>
 2 .Error Handling: Detailed error handling is provided by the API.<br>
 3 .Response is in JSON format
 4 .Contact: For support or issues, contact support@example.com.<br>
