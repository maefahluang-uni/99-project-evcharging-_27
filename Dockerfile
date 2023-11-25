# Build stage
FROM maven:3.8.4-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# Package stage
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar

# Expose port 8100
EXPOSE 8100

# Set the default command to run your application
CMD ["java", "-jar", "/usr/local/lib/app.jar"]
