FROM openjdk:17-oracle
WORKDIR /app
COPY . /app
CMD ["java", "-jar", "usuario-service-0.0.1.jar"]