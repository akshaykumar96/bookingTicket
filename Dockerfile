FROM openjdk:8-jre-alpine
COPY ./target/bookticket-0.0.1-SNAPSHOT.jar /usr/src/booking/
WORKDIR /usr/src/booking
EXPOSE 9005
CMD ["java", "-jar", "bookticket-0.0.1-SNAPSHOT.jar"]
