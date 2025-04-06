Xalts Test Automation
This repository contains the automated test scripts for the Xalts application. The tests are developed using Katalon Studio and Groovy, which include validations for Sign Up, Sign In, and Sign Out functionality.

Project Structure
Test Cases: Contains individual test cases for validating the application’s functionality such as SignUp, SignIn, and SignOut.

SignIn_Valid: Validates successful sign-in functionality.

SignUp_Valid: Validates successful sign-up functionality.

SignIn_Invalid: Validates invalid sign-in scenarios.

SignUp_Invalid: Validates invalid sign-up scenarios.

Keywords: Contains custom keywords used across different test cases. The Signup keyword has all the functions and code to handle sign-up, sign-in, and sign-out processes.

Object Repository: Includes the UI elements used for interacting with the application, such as buttons for sign-in, sign-up, and fields for email and password.

Profiles: Stores environment configurations and other settings for test execution.

Test Suites: Contains groups of test cases for different scenarios.

Requirements
Katalon Studio: Test automation tool used for creating and running the test cases.

Groovy: Programming language used for scripting the tests.

Git: For version control and pushing the project to GitHub.

Setup Instructions
1. Clone the Repository
To get started, clone this repository to your local machine:

bash
Copy
Edit
git clone https://github.com/yourusername/Xalts.git
2. Open Project in Katalon Studio
Launch Katalon Studio.

Select File > Open Project.

Navigate to the folder where you cloned the project and select the Xalts folder.

3. Running Tests
To run a test:

Select the test case or test suite from the Test Explorer.

Click the Run button to execute the test.

4. Modifying Tests
You can modify and extend existing test cases, keywords, or objects to suit your needs. The project structure is organized for easy navigation:

Test cases and keywords are in the respective folders.

Object repository and profiles are also organized by functionality.

5. Committing Changes
After making changes, follow these steps to commit and push to GitHub:

bash
Copy
Edit
git add .
git commit -m "Description of the changes"
git push origin main
Conclusion
This project automates critical scenarios like Sign Up, Sign In, and Sign Out for the Xalts application, helping ensure the functionality of the application is validated efficiently. The project is managed using Katalon Studio and GitHub for version control.
