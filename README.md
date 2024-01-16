# Automation Testing on archive.org using Selenium WebDriver and Java

## Overview
This project demonstrates automation testing on [archive.org](https://archive.org/) using Selenium WebDriver and Java. The automation scripts cover login functionality, registration, and checking links.

## Files
1. **Login.java**
   - Contains automation scripts for login functionality.
   - Validates login with different sets of test data.

2. **Reg.java**
   - Includes automation scripts for user registration.
   - Validates user registration with different sets of test data.

3. **Link.java**
   - Covers automation scripts to check links on the archive.org website.
   - Validates the functionality of various links.

## Prerequisites
Ensure you have the following tools installed:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Selenium WebDriver](https://www.selenium.dev/downloads/)
- [ChromeDriver](https://sites.google.com/chromium.org/driver/)

## How to Run
1. Clone the repository to your local machine using Apache NetBeans.
   
2. Open Apache NetBeans and select "Open Project" from the menu.

3. Navigate to the project directory and open it in NetBeans.

4. Execute the scripts individually:
   - Right-click on `Login.java` and select "Run File."
   - Right-click on `Reg.java` and select "Run File."
   - Right-click on `Link.java` and select "Run File."

## Configuration
- Ensure you have the correct ChromeDriver version that matches your Chrome browser.
- Adjust the ChromeDriver executable path in the scripts if necessary.

## Notes
- These scripts are provided as examples and should be modified to suit the specific needs of your testing scenarios.
- Make sure to handle sensitive information securely, such as login credentials when implementing automation testing.
- For further customization, refer to the Selenium WebDriver documentation: [Selenium Documentation](https://www.selenium.dev/documentation/en/)

Feel free to contribute and enhance these scripts based on your requirements. Happy testing!
