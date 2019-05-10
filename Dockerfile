FROM java:8
EXPOSE 8080

VOLUME /tmp
ADD target/template-1.0-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]