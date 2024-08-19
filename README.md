IDE Used: Eclipse IDE for Java Developers
Version: Photon Release (4.8.0)

java version "22.0.2" 2024-07-16
Java(TM) SE Runtime Environment (build 22.0.2+9-70)
Java HotSpot(TM) 64-Bit Server VM (build 22.0.2+9-70, mixed mode, sharing)

--- This Maven project consists of TDD framework which is used to test the given scenario.



------------Folder Structure-------------

The framework consists of 2 main folders namely, src/main/java and src/test/java:-


> src/main/java consists of 3 packages, namely:

1) com.resolver.AbstractComponent: This holds the abstract component class which basically is a glue for all our Page classes. We can use this class to store the commonality in all our Page object classes. We can also store functionalities to traverse from one WebPage to another.

2) com.resolver.pages: I have used Page Object Model design pattern to correspond each WebPage with a Page class, which are stored under this package.

3) com.resolver.resources: It contains an ExtentReporter Class which is a key point for our reporting mechanism and holds all the relevant code for it. There is also a config.properties file which can hold our environment specific parameters such as URL's, app-tokens, data-base connection strings, browser-names, etc.



> src/test/java consists of 2 packages, namely:

1) com.resolver.commonBase: This package consists of BaseTest, Listeners and Retry classes.
a) The BaseTest serves as a foundational class that provides common setup (browser initialization), teardown (close and clean-up after each test run) and utility functions (getScreenshot) for our framework.
b) The Listeners class handles tasks such as Event Tracking, Custom Logging, Error Handling and Test Reporting.
c) The Retry class is used to automatically rerun failed tests a specified number of times before marking them as failed.
 
2) com.resolver.tests: This package can hold all of our Tests.



> Apart from these, we also have a testSuites folder which contains .xml test files which is used to organize, configure and batch execute different test cases.



> Lastly, our POM.xml file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc.
 


***************EXECUTION: To execute the program, run the testng.xml file in the testSuites folder inside Eclipse IDE***************


Advantages of My framework:

1) Maintainability: Frameworks modular structure and POM concepts contributes to easy maintenance.

2) Reusability: The AbstractComponent class promotes code reuse.

3) Scalability: The overall design of the framework is such that it can add more test scenarios and allows us to scale easily.

4) Flexibility: The config.properties file allows us to adopt the framework to different environment/browsers easily.