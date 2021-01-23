FROM adoptopenjdk/openjdk11:latest
COPY target/test-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]
