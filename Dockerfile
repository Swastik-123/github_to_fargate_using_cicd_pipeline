FROM eclipse-temurin:17-jdk-alpine

# we installing curl command. we curl our health api
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/github_to_fargate_using_cicd_pipeline.jar github_to_fargate_using_cicd_pipeline.jar
ENTRYPOINT ["java","-jar","/github_to_fargate_using_cicd_pipeline.jar"]