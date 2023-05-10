FROM amazoncorretto:11-alpine-jdk
MAINTAINER gjw
COPY target/gjw-0.0.1-SNAPSHOT.jar gjw-app.jar 
ENTRYPOINT ["java", "-jar", "/gjw-app.jar"]
