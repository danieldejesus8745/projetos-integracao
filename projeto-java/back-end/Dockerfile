FROM openjdk:17-jdk-alpine

WORKDIR /home

COPY . .

RUN apk add maven

WORKDIR /home

RUN mvn clean package

EXPOSE 8080

CMD [ "java", "-jar",  "/home/target/addresses-0.0.1-SNAPSHOT.jar"]