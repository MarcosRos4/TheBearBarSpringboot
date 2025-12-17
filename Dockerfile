FROM cimg/openjdk:21.0.9
COPY ./target/thebearbar-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
