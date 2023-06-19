## To run the project in VsCode
Extensions:
- Lombok Annotations Support for VS Code
- Language Support for Java(TM) by Red Hat
- Extension Pack for Java
- Debugger for Java
- Maven for Java
- Project Manager for Java
- Test Runner for Java

## To run the project 
Go to: src\main\java\com\ccf\marelvi\MarelviApplication.java
Right click the file and select Run Java or Debug Java to enter debug mode

# In case the packages are not installed automatically do:
mvn clean package

# To run tests run the command
mvn test

# Endpoints:
## localhost:8080/api/auth/signup
Endpoint type: POST
Body:
{
    "username": "test",
    "password": "test",
    "role": "ROLE_USER"
}

## localhost:8080/api/auth/signin
Endpoint type: POST
Body:
{
    "username": "test",
    "password": "test"
}
