# �⺻ �̹����� OpenJDK ���
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

# ����� JAR ������ �����̳ʿ� ����
COPY ${JAR_FILE} app.jar

# Spring Boot ���ø����̼� ����
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]
