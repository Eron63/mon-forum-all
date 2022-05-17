FROM maven:latest AS maven
WORKDIR /mon-forum-back
COPY . .
RUN mvn clean install

FROM openjdk:13-jdk-alpine
VOLUME /tmp
VOLUME /upload
COPY ./target/mon-forum-back-0.0.1-SNAPSHOT.jar mon-forum-back.jar
ENTRYPOINT ["java","-jar","mon-forum-back.jar"]