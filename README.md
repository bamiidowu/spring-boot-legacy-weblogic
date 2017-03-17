# Spring Boot support for legacy WebLogic
An example of a spring boot application that can be deployed to a legacy WebLogic server (11g and below) which uses servlet 2.5 api

## Dependencies

- __spring-boot-starter-parent__: Using version 1.1.12 for Java SE 6 compatibility 1.1.12.RELEASE
- __servlet-api__: Using version 2.5 supported by legacy WebLogic servers 11g and below
- __spring-boot-legacy__: Using version 1.0.4 support for legacy (Servlet 2.5) apps in Spring Boot [https://github.com/dsyer/spring-boot-legacy]
   
## Running the Application

__You do not run this application by executing the main method in `SpringBootWebLogicLegacyApplication.java`. Please read these instructions to launch this application__

To run the application:

Execute the following commands
 
`cd ~/spring-boot-legacy-weblogic`

`mvn spring-boot:run`

## Building the WAR

__Use the standard Maven Lifecycle "package" goal to create the WAR.__

Note the following commands will fail due to the `spring-boot-starter-tomcat` dependency being given the scope of provided.

`mvn spring-boot:repackage`

## Accessing the Service

Running locally

http://localhost:8080/spring-boot-legacy-app

Running from WebLogic

http://{webLogicServerAddress}:{port}/spring-boot-legacy-app

If you see "Hello World!" then everything is working correctly
