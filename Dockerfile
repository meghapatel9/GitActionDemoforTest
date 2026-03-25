# Use a specific OpenJDK base image
FROM openjdk:17-jdk-slim 
# Set the working directory inside the container
WORKDIR /app
# Copy the built JAR file into the container (ensure 'target/my-api-0.0.1-SNAPSHOT.jar' matches your actual build artifact path and name)
COPY target/my-api-0.0.1-SNAPSHOT.jar /app/app.jar
# Expose the port your Java application runs on (e.g., 8080)
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
