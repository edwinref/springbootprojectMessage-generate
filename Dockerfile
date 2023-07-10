FROM openjdk:17

WORKDIR /app

COPY target/appbts-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar

CMD ["java", "-jar", "springboot-docker-demo.jar"]
