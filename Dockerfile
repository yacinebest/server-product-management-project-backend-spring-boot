#docker image build -t product-management-server-spring .
FROM openjdk:15
EXPOSE 8080
ADD build/libs/server-product-management-0.0.1-SNAPSHOT.jar server-product-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/server-product-management-0.0.1-SNAPSHOT.jar"]