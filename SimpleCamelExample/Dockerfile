FROM openjdk:14
COPY ./target/SimpleCamelExample-1.0-SNAPSHOT.jar /app.jar
COPY ./target/lib /lib
ENTRYPOINT ["java","-jar", "app.jar"]