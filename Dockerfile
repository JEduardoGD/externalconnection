FROM openjdk:17-alpine

LABEL maintainer="eduardo_gd@hotmail.com"

VOLUME /tmp

ADD target/externalconnection-0.0.1-SNAPSHOT.jar externalconnection.jar
 
EXPOSE 9080

WORKDIR /

ENTRYPOINT ["java","-jar", "/externalconnection.jar"]
