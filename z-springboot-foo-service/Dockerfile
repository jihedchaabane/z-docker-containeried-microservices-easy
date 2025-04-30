FROM openjdk:21
WORKDIR /var/lib/jenkins/workspace/jars
ADD target/z-springboot-foo-service-0.0.1-SNAPSHOT.jar z-springboot-foo-service.jar
COPY target/z-springboot-foo-service-0.0.1-SNAPSHOT.jar z-springboot-foo-service-0.0.1-SNAPSHOT.jar
EXPOSE 7778
ENTRYPOINT ["java", "-jar", "z-springboot-foo-service-0.0.1-SNAPSHOT.jar"]