FROM openjdk:21
WORKDIR /var/lib/jenkins/workspace/jars
ADD target/z-springboot-hello-world-service-0.0.1-SNAPSHOT.jar z-springboot-hello-world-service.jar
COPY target/z-springboot-hello-world-service-0.0.1-SNAPSHOT.jar z-springboot-hello-world-service-0.0.1-SNAPSHOT.jar
EXPOSE 7776
ENTRYPOINT ["java", "-jar", "z-springboot-hello-world-service-0.0.1-SNAPSHOT.jar"]