FROM eclipse-temurin:17-jre-alpine

COPY target/library-app-1.0.jar /app/library-app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "library-app.jar"]