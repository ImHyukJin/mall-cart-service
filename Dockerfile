<<<<<<< HEAD
# ±âº» ÀÌ¹ÌÁö·Î OpenJDK »ç¿ë
=======
# ê¸°ë³¸ ì´ë¯¸ì§€ë¡œ OpenJDK ì‚¬ìš©
>>>>>>> 58e2e23d4083520b31010d98b7d11d8f754cbdbf
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

<<<<<<< HEAD
# ºôµåµÈ JAR ÆÄÀÏÀ» ÄÁÅ×ÀÌ³Ê¿¡ º¹»ç
=======
# ë¹Œë“œëœ JAR íŒŒì¼ì„ ì»¨í…Œì´ë„ˆì— ë³µì‚¬
>>>>>>> 58e2e23d4083520b31010d98b7d11d8f754cbdbf
COPY ${JAR_FILE} app.jar

# Spring Boot ì• í”Œë¦¬ì¼€ì´ì…˜ ì‹¤í–‰
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]

