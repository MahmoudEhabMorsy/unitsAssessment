# QA Technical Assessment (Units Assessment)

This repository contains a comprehensive quality assurance project conducted for a Software Support and Integration Engineer assessment. It covers the full testing lifecycle, including manual execution, API validation, UI automation, and performance testing.

---

## Project Overview

The project is divided into four main sections:

1. **Manual Testing & Bug Reporting**: Executed on the [SauceDemo](https://www.saucedemo.com/) (SwagLabs) website.  
2. **API Testing**: Functional and error-handling tests for the [Automation Exercise API](https://automationexercise.com/api_list).  
3. **UI Automation**: A Selenium-based Page Object Model (POM) suite for critical user paths.  
4. **Load Testing**: Performance benchmarking for API endpoints using Apache JMeter.

---

## Tools & Technologies Used

- **Manual**: Google Sheets (for Test Cases & Bug Tracking).  
- **API**: Postman.  
- **Automation**: Java, Selenium WebDriver, TestNG, Maven (Page Object Model).  
- **Load Testing**: Apache JMeter.

---

## Deliverables & Links

- **Test Report (Google Sheets)**:  
  [Manual Test Cases & Bug Report](https://docs.google.com/spreadsheets/d/1SzlKqA-Yf8f3Q5D6q5yvSfbdqCnxgIYMAQ8FIgo9v_A/edit?usp=sharing)  

- **Video Walkthrough**: [Explanation Video](https://drive.google.com/file/d/1snDXNdFsyAsNi7nWdVGeS2ORbeescHbT/view?usp=sharing)

---

## Repository Structure

```text
unitsAssessment/
├── API Testing/                 # Postman Collection JSON
├── Load Testing/                # JMeter (.jmx) script and (.jtl) results
├── Manual Testing & Bug Report/ # Offline backup of the manual test suite
├── src/                         # Java Automation source code (POM)
│   ├── main/java/Pages/         # Page Objects
│   └── test/java/Tests/         # TestNG Test Cases (TC_01, TC_02)
├── pom.xml                      # Maven dependencies and configuration
└── README.md                    # Project documentation
