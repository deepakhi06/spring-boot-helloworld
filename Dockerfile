# Start with a base image containing Java runtime
FROM java:8

# Add Maintainer Info
LABEL maintainer="Deepak kashyap"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8111

# The application's jar file
#ARG JAR_FILE=target/spring-boot-helloworld.jar

# Add the application's jar to the container
ADD target/spring-boot-helloworld.jar spring-boot-helloworld.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/spring-boot-helloworld.jar"]