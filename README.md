
# Clickatell Assessment - Automation Framework

## Overview
This project is an automated test framework created for testing multiple functionalities of the Expedia web application. Built with Selenium WebDriver, it integrates with Maven and TestNG for streamlined build automation using the Page Object Model. The framework supports cross-browser testing and is designed for easy extensibility to accommodate diverse testing requirements.

## Table of Contents
+ Project Structure
+ Prerequisites
+ Setup
+ Running Tests
+ Test Reports
+ GitHub Actions CI/CD
+ Contributing
+ License

## Project Structure
- **src/main/java**: Contains the main codebase, including page objects and utility classes.
- **src/test/java**: Contains the test scripts and test data.
- **target**: Directory where the compiled code and test reports are generated.
- **pom.xml**: Maven configuration file that includes dependencies and build instructions.
- **README.md**: This file, providing an overview of the project.

## Prerequisites
Java JDK 22 or above: Ensure Java is installed and the JAVA_HOME environment variable is set.
Maven: Ensure Maven is available in your pom.xml file and WebDriver manager setup as well.

## Setup
### 1. Clone the Repository
```
git clone https://github.com/mendi-J/clickatell-assessment.git
cd clickatell-assessment 
```

# Running Tests
### Running Tests in IntelliJ IDEA
To run the tests in IntelliJ IDEA:
1. Open the Project: Open the project in IntelliJ IDEA.
2. Navigate to Test Class: Right-click on the test class or the test method you want to run.
3. Run the Test: Select Run from the context menu, or use the shortcut Shift + F10 to execute the tests.

### Running Tests via GitHub Actions
The tests are automatically executed via GitHub Actions when you push changes to the repository. The CI pipeline is configured to run the tests and generate reports. 
To run the tests manually through GitHub Actions:
1. Push Your Code: Commit and push your changes to the repository.
2. Trigger Workflow: The GitHub Actions workflow will automatically start, executing the tests as defined in the .github/workflows directory.
3. View Results: You can monitor the progress and view the test results in the "Actions" tab of your GitHub repository.

# Test Reports
After running the tests, reports will be generated in the target/surefire-reports directory. These reports provide detailed information about the tests that were run, including any failures or errors.

To view test reports:

1. Navigate to the reports directory.
2. Open the index.html file in a browser.

# GitHub Actions CI/CD
This project is integrated with GitHub Actions for Continuous Integration. The workflow is defined in .github/workflows/clickatell-tasks.yml and is triggered on every push to the main branch.

### Key Features
1. **Page Object Model (POM):** Implements the Page Object Model design pattern to separate test scripts from the underlying page structure, improving maintainability and readability of tests.
2. **Test Execution:** Automatically runs tests on every push to the repository, ensuring continuous integration.
3. **Artifact Storage:** Archives test reports and screenshots for review, making it easy to diagnose issues and verify results.
4. **JDK Setup:** Ensures the correct JDK version is used during the build process, maintaining consistency across different environments.