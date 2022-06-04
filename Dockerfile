#FROM openjdk:8-jre-alpine
FROM adoptopenjdk/openjdk11:latest
COPY target/CarApp-0.0.1-SNAPSHOT.jar carapp.jar
CMD ["java", "-jar", "carapp.jar"]
EXPOSE 8081