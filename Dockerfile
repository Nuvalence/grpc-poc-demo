# define base docker image
FROM openjdk:17
RUN ls -l
COPY build/libs/grpc-horoscope-demo-0.0.1-SNAPSHOT.jar grpc-horoscope-demo-0.0.1.jar
#COPY target/grpc-horoscope-demo-0.0.1-SNAPSHOT.jar poc-app.jar
ENTRYPOINT ["java", "-jar", "/grpc-horoscope-demo-0.0.1.jar"]