# REST API Automation with Java, Rest-Assured, TestNG, and Allure

## PetStore Demo API

The framework was tested against the PetStore Demo WebService, which is a RESTful API for managing pets. 

The API documentation is available at:

## https://petstore.swagger.io/.

The framework allows for automated testing of RESTful APIs using the following technologies:

- **Java**
- **Rest-Assured:** A Java library that facilitates the execution of RESTful API tests.
- **TestNG:** A Java software testing framework.
- **Allure:** A test report generation tool.

## **Installation:**

To install the framework, follow these steps:

**Clone the GitHub repository.**

**Install the project dependencies:**

```jsx
mvn clean install
```

## **Running the tests:**

**To run the tests, execute the following command:**

```jsx
mvn clean test
```

This will execute all the tests in the project.

## **Generating Allure reports:**

**To generate the Allure reports, execute the following command from target directory:**

```jsx
cd ./restassured-api-automation/target
```

```jsx
allure serve
```

**This will open a web server that will display the Allure reports.**

##
