# TREC-TestRail Enhancement Client

A web client offering several functions to enrich TestRail with processes to ease the use of TestRail or to add missing features.

## Getting Started

### Prerequisites

* jdk 1.8
* Maven 3

### Installing

Run ```mvn clean install``` to build the application. This will build the application also runs the tests.

### Skipping the tests

To skip the tests run ```mvn clean install -DskipTests```

## Running/Booting up the application

To start the application, run ```java -jar testrail-enhancement-client-0.0.1-SNAPSHOT.jar --logging.file=/path/TestRail/TREC.log --server.port=8099 --spring.profiles.active=test```.

The logging.file and server.port argument are optional. Profile is mandatory to set. The profile "test" is to connect to test enviornment of TestRail instance, while the "prod" profile is to point to the production environment of TestRail.

If port not set explicitly then the application runs on 8080 which is the default port for spring-boot app.

You can launch the application in your browser with the url http://hostname:8080 (8080 if port not set)

## Built With

* Spring Boot 1.5.9
* [Maven](https://maven.apache.org/)
* AngularJS 1.5.6

## License


