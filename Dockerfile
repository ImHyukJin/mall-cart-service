<<<<<<< HEAD
# �⺻ �̹����� OpenJDK ���
=======
# 기본 이미지로 OpenJDK 사용
>>>>>>> b0b22f8fdae2514ce8fa105fa109385f85f0fe57
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

<<<<<<< HEAD
# ����� JAR ������ �����̳ʿ� ����
=======
# 빌드된 JAR 파일을 컨테이너에 복사
>>>>>>> b0b22f8fdae2514ce8fa105fa109385f85f0fe57
COPY ${JAR_FILE} app.jar

# Spring Boot ���ø����̼� ����
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]

