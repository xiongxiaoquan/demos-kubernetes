# 文件内容：
FROM openjdk:8-jre-alpine
COPY target/cronjob-demo-1.0-SNAPSHOT.jar /cronjob-demo.jar
ENTRYPOINT ["java","-cp","/cronjob-demo.jar","com.k8s.cronjob.Main"]