FROM centos:centos7

LABEL MAINTAINER=jaswathkumar54321@gmail.com

# Install Node etc...
RUN yum -y update; yum clean all
RUN yum -y install java-1.8.0-openjdk; yum clean all

# Copy source code to /src in container
COPY . /src

# Install app and dependencies into /src in container
WORKDIR /
ADD ./springboot-rest-api-0.0.1-SNAPSHOT.jar /springboot-rest-api-0.0.1-SNAPSHOT.jar
#ADD ./pom.xml /pom.xml

# Document the port the app listens on
EXPOSE 8080

# Run this command (starts the app) when the container starts
CMD ["java", "-jar", "springboot-rest-api-0.0.1-SNAPSHOT.jar"]
