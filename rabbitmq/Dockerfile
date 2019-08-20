
FROM openjdk:11
##Specify the work directory
WORKDIR usr/src/rabbit-mq
##Add the jar file to be executed
ADD target/rabbitmq-0.0.1-SNAPSHOT.jar /usr/src/rabbit-mq/rabbitmq-0.0.1-SNAPSHOT.jar
##ENTRYPOINT allows you to configure a container that will run as an executable
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","rabbitmq-0.0.1-SNAPSHOT.jar"]
