FROM amazoncorretto:11
ADD target/k8sdemo-1.jar k8s.jar
ENTRYPOINT ["java","-jar","/k8s.jar"]
