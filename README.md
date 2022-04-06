# spring-boot-kafka
Simple Spring Boot demo project with Apache Kafka

Information
https://www.confluent.io/blog/apache-kafka-spring-boot-application/

Detail information on Apache Kafka and Kafka setup to run this applicaton.
https://javatechonline.com/how-to-work-with-apache-kafka-in-spring-boot/



How to test the Application?

1. Install Kafka 
2. Run Zookeeper server
3. Run Kafka server
4. create kafka topic "users"
5. Run spring boot application
6. Invoke API

curl -X POST -F "message=test" http://localhost:9000/kafka/publish

