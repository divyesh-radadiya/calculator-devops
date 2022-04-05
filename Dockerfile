FROM openjdk:11
COPY ./target/calculator-devops-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator-devops-0.0.1-SNAPSHOT.jar"]
