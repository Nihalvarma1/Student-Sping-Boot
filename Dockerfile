FROM eclipse-temurin:17-jdk-focal
EXPOSE 6708
ADD target/StudentInfo-0.0.1-SNAPSHOT.jar StudentInfo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/StudentInfo-0.0.1-SNAPSHOT.jar"]