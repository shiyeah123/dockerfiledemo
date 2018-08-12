FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
#EXPOSE 50505
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom",\
             "-agentlib:jdwp=transport=dt_socket,address=50505,suspend=n,server=y",\
             "-jar","/app.jar"]