FROM maven:3.8.4-jdk-8 AS build
WORKDIR /app
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN mvn -B dependency:go-offline
COPY src ./src
RUN mvn -B package -DskipTests
FROM openjdk:8-jdk-alpine
COPY --from=build /app/target/*.jar /app/app.jar