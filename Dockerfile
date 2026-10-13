
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/ci-cd-pipeline-1.0.0.jar app.jar

ENTRYPOINT ["java", "-cp", "app.jar", "com.example.App"]
