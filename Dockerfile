<<<<<<< HEAD
# ±âº» ÀÌ¹ÌÁö·Î OpenJDK »ç¿ë
=======
# ï¿½âº» ï¿½Ì¹ï¿½ï¿½ï¿½ï¿½ï¿½ OpenJDK ï¿½ï¿½ï¿½
>>>>>>> 9126a2fea62b7070b84aa7351a7d63b26a4a1b3b
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

<<<<<<< HEAD
# ºôµåµÈ JAR ÆÄÀÏÀ» ÄÁÅ×ÀÌ³Ê¿¡ º¹»ç
COPY ${JAR_FILE} app.jar

# Spring Boot ¾ÖÇÃ¸®ÄÉÀÌ¼Ç ½ÇÇà
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]

=======
# ï¿½ï¿½ï¿½ï¿½ï¿½ JAR ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½Ì³Ê¿ï¿½ ï¿½ï¿½ï¿½ï¿½
COPY ${JAR_FILE} app.jar

# Spring Boot ï¿½ï¿½ï¿½Ã¸ï¿½ï¿½ï¿½ï¿½Ì¼ï¿½ ï¿½ï¿½ï¿½ï¿½
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]
>>>>>>> 9126a2fea62b7070b84aa7351a7d63b26a4a1b3b
