FROM openjdk:17
EXPOSE 8080
ADD target/temp-integration.jav temp-integration.jar
ENTRYPOINT ["java","-jar","/temp-jar"]