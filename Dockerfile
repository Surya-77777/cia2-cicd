
# Use Java 17 runtime
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the generated Spring Boot JAR
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Start the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]
