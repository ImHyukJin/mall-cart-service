<<<<<<< HEAD
# �⺻ �̹����� OpenJDK ���
=======
# �⺻ �̹����� OpenJDK ���
>>>>>>> 9126a2fea62b7070b84aa7351a7d63b26a4a1b3b
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

<<<<<<< HEAD
# ����� JAR ������ �����̳ʿ� ����
COPY ${JAR_FILE} app.jar

# Spring Boot ���ø����̼� ����
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]

=======
# ����� JAR ������ �����̳ʿ� ����
COPY ${JAR_FILE} app.jar

# Spring Boot ���ø����̼� ����
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]
>>>>>>> 9126a2fea62b7070b84aa7351a7d63b26a4a1b3b
