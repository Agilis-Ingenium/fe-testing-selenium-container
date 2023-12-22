# Front End Testing Solution

## Selenium Container

This repo contains:
- Code for a Selenium Java App that can test the functionality of the front end of the Nubadoo Health Track Web App. **src/test**
- It also contains code to Dockerise this app. **.docker/Dockerfile**
- And Github Actions that will push the container image to Docker Hub. **.github/workflows/github-actions.yaml**

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

- To add additional tests use the Selenium IDE to record test and generate Java test files (https://www.selenium.dev/selenium-ide/)
- Then drop the test files generated in the folder **src/test/java/tests**

