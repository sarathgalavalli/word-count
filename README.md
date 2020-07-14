This project is a java project with maven for build automation and Junit for test classes.

The following project takes the input as a file and outputs number of words with length greater than 5 and words starting with m or 'M'.
The given project removes any special characters from the given string and does not consider these in the length.

If you do not have maven locally installed on your system you can create a wrapper script which downloads automatically the correct version of Maven. 
run: cd {your-project}
     mvn -N io.takari:maven:wrapper
To execute mvn wrapper for unix system: ./mvnw clean package 

if oyu have it installed locally then run the following steps:

To run this project just clone this project to your local repository and build the project using: maven install

To ensure that the build target is removed before a new build, add the clean target run: mvn clean install

To compile the project use: mvn compile

To create a jar file: mvn clean package

You can also run tests using: mvn tests





