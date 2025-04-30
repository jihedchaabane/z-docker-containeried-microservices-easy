FROM openjdk:21
WORKDIR /var/lib/jenkins/workspace/jars
ADD target/z-springboot-hello-0.0.1-SNAPSHOT.jar z-springboot-hello.jar
COPY target/z-springboot-hello-0.0.1-SNAPSHOT.jar z-springboot-hello-0.0.1-SNAPSHOT.jar
EXPOSE 7775
ENTRYPOINT ["java", "-jar", "z-springboot-hello-0.0.1-SNAPSHOT.jar"]