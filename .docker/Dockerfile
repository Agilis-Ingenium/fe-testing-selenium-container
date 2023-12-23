#FROM maven:3.6-jdk-11
FROM markhobson/maven-firefox

WORKDIR /tests
COPY ../pom.xml .
RUN mvn install
COPY .. .
ENTRYPOINT ["sh", "./bin/run.sh"]
#ENTRYPOINT [ "tail", "-f", "/dev/null" ]

