---

# QA Technical Assessment Portfolio

This repository contains a comprehensive quality assurance project conducted for a Software Support and Integration Engineer assessment[cite: 1]. It covers the full testing lifecycle, including manual execution, API validation, UI automation, and performance testing.

##  Project Overview

The project is divided into four main sections:
1.  **Manual Testing & Bug Reporting**: Executed on the [SauceDemo](https://www.saucedemo.com/) (SwagLabs) website[cite: 1].
2.  **API Testing**: Functional and error-handling tests for the [Automation Exercise API](https://automationexercise.com/api_list)[cite: 1].
3.  **UI Automation**: A Selenium-based Page Object Model (POM) suite for critical user paths[cite: 1].
4.  **Load Testing**: Performance benchmarking for API endpoints using Apache JMeter[cite: 1].

---

##  Tools & Technologies Used

*   **Manual**: Google Sheets (for Test Cases & Bug Tracking)[cite: 1].
*   **API**: Postman.
*   **Automation**: Java, Selenium WebDriver, TestNG, Maven (Page Object Model).
*   **Load Testing**: Apache JMeter.

---

##  Deliverables & Links

*   **Test Report (Google Sheets)**: [https://docs.google.com/spreadsheets/d/1SzlKqA-Yf8f3Q5D6q5yvSfbdqCnxgIYMAQ8FIgo9v_A/edit?usp=sharing]
*   **Video Walkthrough**: []

---

##  Repository Structure
```text
unitsAssessment/
├── API Testing/                 # Postman Collection JSON[cite: 1]
├── Load Testing/                # JMeter (.jmx) script and (.jtl) results[cite: 1]
├── Manual Testing & Bug Report/ # Offline backup of the manual test suite[cite: 1]
├── src/                         # Java Automation source code (POM)[cite: 1]
│   ├── main/java/Pages/         # Page Objects
│   └── test/java/Tests/         # TestNG Test Cases (TC_01, TC_02)
├── pom.xml                      # Maven dependencies and configuration
└── README.md                    # Project documentation
