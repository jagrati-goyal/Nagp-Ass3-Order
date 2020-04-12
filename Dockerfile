FROM openjdk:8
VOLUME /tmp
ADD target/order-0.0.1-SNAPSHOT.jar order.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "order.jar"]