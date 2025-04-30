FROM amazoncorretto:21.0.7

WORKDIR /app

COPY target/cn-gateway-0.0.1-SNAPSHOT.jar /app/cn-gateway.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "cn-gateway.jar"]