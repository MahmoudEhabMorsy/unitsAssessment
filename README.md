# Units Assessment Testing Project

> **Educational Project Notice**
> This project was developed as a comprehensive software testing assessment covering multiple QA disciplines including automated UI testing, API testing, load testing, and manual testing. The implementation demonstrates modern software quality assurance practices using Selenium WebDriver, TestNG, Postman, JMeter, and structured bug reporting.

## Overview

The Units Assessment Testing Project is a multi-layered software testing project designed to validate web application functionality through different testing methodologies.

The project combines:

* UI automation testing
* API testing
* Load testing
* Manual testing
* Bug reporting

The automation framework follows clean modular architecture principles using:

* Selenium WebDriver
* TestNG
* Java
* Maven
* Page Object Model (POM)

Additionally, the project includes:

* Postman API collections
* JMeter load testing scripts
* Manual test cases and bug reports

This project demonstrates practical QA engineering skills across both functional and non-functional testing domains.

---

# Features

* Automated UI testing using Selenium
* Page Object Model (POM) implementation
* TestNG-based test execution
* API testing using Postman
* Load testing using Apache JMeter
* Manual testing documentation
* Bug reporting workflows
* Modular automation architecture
* Maven dependency management
* Reusable test components

---

# Technologies Used

## Automation Testing

* Java
* Selenium WebDriver
* TestNG
* Maven

## API Testing

* Postman

## Load Testing

* Apache JMeter

## Manual Testing

* Excel-based test cases and bug reports

---

# Project Structure

```text
unitsAssessment-master/
│
├── pom.xml
├── README.md
│
├── src/
│   ├── Pages/
│   │   ├── BasePage.java
│   │   ├── LoginPage.java
│   │   ├── ProductsPage.java
│   │   ├── CartPage.java
│   │   ├── CheckoutPageStepOnePage.java
│   │   ├── CheckoutPageStepTwoPage.java
│   │   └── CheckoutCompletePage.java
│   │
│   └── Tests/
│       ├── BaseTest.java
│       ├── TC_01.java
│       └── TC_02.java
│
├── API Testing/
│   └── AutomationExercise.postman_collection.json
│
├── Load Testing/
│   ├── Thread Group.jmx
│   └── Summary Report.jtl
│
└── Manual Testing & Bug Report/
    └── QC_Assessment_SwagLab_Manual.xlsx
```

---

# Automation Testing Framework

The automation framework is designed using:

```text
Page Object Model (POM)
```

This architecture improves:

* Test maintainability
* Reusability
* Scalability
* Readability

---

# Page Object Model (POM)

The framework separates page interactions into dedicated classes.

| Page Class              | Responsibility                       |
| ----------------------- | ------------------------------------ |
| BasePage                | Shared browser actions and utilities |
| LoginPage               | Handles authentication workflows     |
| ProductsPage            | Handles product interactions         |
| CartPage                | Handles cart operations              |
| CheckoutPageStepOnePage | Handles checkout user information    |
| CheckoutPageStepTwoPage | Handles checkout confirmation        |
| CheckoutCompletePage    | Handles order completion validation  |

Example reusable methods:

```java
click()
sendKeys()
getText()
```

---

# Automated Test Scenarios

The project includes automated functional test cases such as:

* User login validation
* Product selection workflows
* Cart operations
* Checkout process validation
* Order completion verification

Example test classes:

```text
TC_01.java
TC_02.java
```

The tests are executed using:

```text
TestNG
```

which provides:

* Assertions
* Test execution management
* Reporting support
* Test lifecycle handling

---

# API Testing

The project includes API testing collections created using:

```text
Postman
```

### API Collection

```text
AutomationExercise.postman_collection.json
```

The API tests demonstrate:

* Endpoint validation
* Request/response handling
* API workflow testing
* Functional API verification

---

# Load Testing

The project includes performance and load testing using:

```text
Apache JMeter
```

### Load Testing Files

| File               | Purpose                 |
| ------------------ | ----------------------- |
| Thread Group.jmx   | JMeter test plan        |
| Summary Report.jtl | Execution result report |

The load testing implementation demonstrates:

* Concurrent user simulation
* Request performance measurement
* Throughput analysis
* Basic non-functional testing concepts

---

# Manual Testing & Bug Reporting

The project also includes manual testing documentation.

### Included Artifacts

```text
QC_Assessment_SwagLab_Manual.xlsx
```

This file contains:

* Manual test cases
* Test execution details
* Bug reports
* Defect tracking information

The manual testing section demonstrates:

* Structured QA processes
* Test documentation skills
* Defect reporting workflows
* Functional validation planning

---

# Maven Dependency Management

The project uses:

```text
Maven
```

for:

* Dependency management
* Build automation
* Test execution
* Project configuration

Project configuration file:

```text
pom.xml
```

---

# Core QA Concepts Demonstrated

This project demonstrates several important QA and software testing concepts:

* UI automation testing
* API testing
* Load testing
* Manual testing
* Bug reporting
* Page Object Model architecture
* TestNG framework usage
* Selenium WebDriver automation
* Modular automation framework design
* Functional and non-functional testing

---

# Test Execution Workflow

```text
Initialize WebDriver
          ↓
Open Application
          ↓
Execute Automated Test Steps
          ↓
Validate Expected Results
          ↓
Generate Reports
          ↓
Close Browser Session
```

---

# Development Environment

The project can be developed and executed using:

* IntelliJ IDEA
* Eclipse IDE
* Visual Studio Code

### Required Tools

* Java JDK 8+
* Maven
* Chrome Browser
* ChromeDriver
* Postman
* Apache JMeter

---

# How to Build and Run

## 1. Clone the Repository

```bash
git clone https://github.com/MahmoudEhabMorsy/unitsAssessment.git
```

## 2. Navigate to Project Directory

```bash
cd unitsAssessment-master
```

## 3. Install Dependencies

Using Maven:

```bash
mvn clean install
```

## 4. Run Automated UI Tests

```bash
mvn test
```

---

# Running API Tests

## Using Postman

1. Open Postman
2. Import:

```text
AutomationExercise.postman_collection.json
```

3. Execute the collection

---

# Running Load Tests

## Using Apache JMeter

1. Open Apache JMeter
2. Load:

```text
Thread Group.jmx
```

3. Run the test plan
4. View results inside:

```text
Summary Report.jtl
```

---

# Example Automated Workflow

## E-Commerce Checkout Scenario

```text
Open Login Page
      ↓
Authenticate User
      ↓
Add Product To Cart
      ↓
Proceed To Checkout
      ↓
Confirm Order
      ↓
Validate Successful Purchase
```

---

# Educational Value

This project provides practical experience with:

* Selenium automation testing
* API testing workflows
* Load and performance testing
* Manual testing documentation
* Software quality assurance practices
* Structured automation framework design
* Real-world QA workflows

It serves as a strong practical introduction to:

* QA engineering
* Test automation
* Performance testing
* Software validation processes

---

# Possible Future Improvements

Potential enhancements include:

* CI/CD integration using GitHub Actions or Jenkins
* Cross-browser testing support
* Parallel test execution
* Dockerized automation environment
* Advanced reporting integration
* API automation integration into CI pipelines
* Database validation support
* BDD framework integration using Cucumber
* Cloud-based test execution
* Retry mechanisms and advanced logging

---

# Known Limitations

* Educational prototype framework
* Limited browser configuration support
* Basic load testing implementation
* No CI/CD pipeline integration
* Limited advanced reporting support

---

# Framework Design Highlights

The project emphasizes:

* Multi-layered QA testing practices
* Modular automation architecture
* Clean Page Object Model implementation
* Separation between testing layers
* Maintainable automation framework design

---

# Author

Developed by:

* Mahmoud Ehab

---

# License

This project is provided for educational and learning purposes.

You are free to study, modify, and extend the implementation for academic or personal use.

---

# Acknowledgments

Special thanks to:

* Selenium WebDriver documentation
* TestNG framework resources
* Postman API testing resources
* Apache JMeter documentation
* Open-source QA automation communities
