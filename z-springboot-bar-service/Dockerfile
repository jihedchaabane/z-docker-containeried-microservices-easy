FROM openjdk:21
WORKDIR /var/lib/jenkins/workspace/jars
ADD target/z-springboot-bar-service-0.0.1-SNAPSHOT.jar z-springboot-bar-service.jar
COPY target/z-springboot-bar-service-0.0.1-SNAPSHOT.jar z-springboot-bar-service-0.0.1-SNAPSHOT.jar
EXPOSE 7777
ENTRYPOINT ["java", "-jar", "z-springboot-bar-service-0.0.1-SNAPSHOT.jar"]