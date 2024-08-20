FROM maven:3.8.2-jdk-17
WORKDIR /app1
COPY target/*.jar/ app1
RUN mvn clean package
CMD ["java","-jar","app1"]