#FROM maven:3.6-jdk-11
FROM markhobson/maven-firefox

WORKDIR /tests
COPY ../pom.xml .
RUN mvn install
COPY .. .
#ENTRYPOINT ["sh", "./bin/run.sh"]

ENTRYPOINT [ "tail", "-f", "/dev/null" ]

# This makes sense for the final solution... (WB)
# SEE NOTE FROM
# https://selcuktemizsoy.medium.com/dockerize-selenium-tests-and-run-as-part-of-github-actions-pipeline-f241735700ea

# "I gave an unnecessary command for entry point since in pipeline, you will
# trigger your test as a separate step, as a result you need to start your
# container first and then give this run.sh."

