<<<<<<< HEAD
# �⺻ �̹����� OpenJDK ���
=======
# 기본 이미지로 OpenJDK 사용
>>>>>>> 58e2e23d4083520b31010d98b7d11d8f754cbdbf
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

<<<<<<< HEAD
# ����� JAR ������ �����̳ʿ� ����
=======
# 빌드된 JAR 파일을 컨테이너에 복사
>>>>>>> 58e2e23d4083520b31010d98b7d11d8f754cbdbf
COPY ${JAR_FILE} app.jar

# Spring Boot 애플리케이션 실행
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]

