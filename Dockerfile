FROM openjdk:17
EXPOSE 8080
ADD target/temp-integration.jar temp-integration.jar
ENTRYPOINT ["java","-jar","/temp-integration"]