FROM adoptopenjdk:17-jre-hotspot
WORKDIR /app
COPY . /app
CMD ["java", "-jar", "usuario-service-0.0.1.jar"]