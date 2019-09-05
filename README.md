# AutomationPracticetests

# Project Description
This is a lightweight Automation framework using cucumber-selenium-maven in java. 

# Project Structure 
- src/main/java - used for storing the page objects 
- src/test/java/runners - junit test runner for running cucumber features based on tags 
- src/test/java/stepDefinitions - the feature implementations can be done on this folder 
- src/test/java/resources/features - this is where all the feature files are located 

# Run Instructions 
- Git clone https://github.com/sakthimc/AutomationPracticetests.git 
- Wait for the dependencies to be loaded 
- from the command line - mvn clean test 
- from feature file - you can run by just right clicking on either the scenario tag or the feature tag 

# Reports
- AutomationPracticetests/target/cucumber-reports - cucumber reports can be found in this folder. Open index.html using any browser to view the reports 

# Limitations 
- At the moment, the tests run only on chrome browser [Currently set to in headed mode]. Project can expanded easily to include 
other browser drivers 
- Abstractions have been kept to minimum