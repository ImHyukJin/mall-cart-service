<<<<<<< HEAD
# ±‚∫ª ¿ÃπÃ¡ˆ∑Œ OpenJDK ªÁøÎ
=======
# Í∏∞Î≥∏ Ïù¥ÎØ∏ÏßÄÎ°ú OpenJDK ÏÇ¨Ïö©
>>>>>>> b0b22f8fdae2514ce8fa105fa109385f85f0fe57
FROM openjdk:11-jdk-slim

ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV

<<<<<<< HEAD
# ∫ÙµÂµ» JAR ∆ƒ¿œ¿ª ƒ¡≈◊¿Ã≥ ø° ∫πªÁ
=======
# ÎπåÎìúÎêú JAR ÌååÏùºÏùÑ Ïª®ÌÖåÏù¥ÎÑàÏóê Î≥µÏÇ¨
>>>>>>> b0b22f8fdae2514ce8fa105fa109385f85f0fe57
COPY ${JAR_FILE} app.jar

# Spring Boot æ÷«√∏Æƒ…¿Ãº« Ω««‡
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}","-jar","app.jar"]

