# Automation Testing on archive.org using Selenium WebDriver and Java

## Overview
This project demonstrates automation testing on [archive.org](https://archive.org/) using Selenium WebDriver and Java. The automation scripts cover login functionality, registration, and checking links.

## Files
1. **login.java**
   - Contains automation scripts for login functionality.
   - Validates login with different sets of test data.

2. **reg.java**
   - Includes automation scripts for user registration.
   - Validates user registration with different sets of test data.

3. **link.java**
   - Covers automation scripts to check links on the archive.org website.
   - Validates the functionality of various links.

## Prerequisites
Ensure you have the following tools installed:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Selenium WebDriver](https://www.selenium.dev/downloads/)
- [ChromeDriver](https://sites.google.com/chromium.org/driver/)

## How to Run
1. Clone the repository to your local machine.
   ```bash
   git clone https://github.com/your-username/archive.org-automation-testing.git
   ```

2. Navigate to the project directory.
   ```bash
   cd archive.org-automation-testing
   ```

3. Execute the scripts individually.
   ```bash
   java login.java
   java reg.java
   java link.java
   ```

## Configuration
- Ensure you have the correct ChromeDriver version that matches your Chrome browser.
- Adjust the ChromeDriver executable path in the scripts if necessary.

## Notes
- These scripts are provided as examples and should be modified to suit the specific needs of your testing scenarios.
- Make sure to handle sensitive information securely, such as login credentials, when implementing automation testing.
- For further customization, refer to the Selenium WebDriver documentation: [Selenium Documentation](https://www.selenium.dev/documentation/en/)

Feel free to contribute and enhance these scripts based on your requirements. Happy testing!
