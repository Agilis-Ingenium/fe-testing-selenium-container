# Front End Testing Solution

## Selenium Container

This repo contains:
- Code for a Selenium Java App that can test the functionality of the front end of the Nubadoo Health Track Web App.
- It also contains code to Dockerise this app.
- And Github Actions that will push the container image to Docker Hub.

### Tool stack
* Java 8+
* Maven
* JUnit
* Selenium
* Github actions
* Docker

### Run
* To install maven dependencies

```
mvn install
```

* Run test 

```
mvn test
```

### Extend
To add additional tests use the Selenium IDE to generate Java test files.
Then drop the test files generated in the folder **src/test/java/tests**

