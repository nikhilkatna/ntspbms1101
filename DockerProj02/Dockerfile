FROM openjdk
WORKDIR /app1
COPY target/*.jar/ app1
RUN mvn clean package
CMD ["java","-jar","app1"]