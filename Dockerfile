FROM tomcat:8.5-jdk11-openjdk-slim
RUN sed -i 's/port="8080"/port="8082"/' ${CATALINA_HOME}/conf/server.xml
ADD target/sample.war /usr/local/tomcat/webapps/
EXPOSE 8082
CMD ["catalina.sh", "run"]