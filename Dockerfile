FROM tomcat:8.5.47-jdk8-openjdk

MAINTAINER Quang Vinh "nqvinh7603@gmail.com"

WORKDIR /usr/local/bin/

COPY ./target/fleetman-0.0.1-SNAPSHOT.jar webapp.jar

EXPOSE 8080

CMD ["java", "-Dspring.profiles.active=docker-demo", "-jar", "webapp.jar"]
