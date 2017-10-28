mvn clean package -DskipTests;
java -jar target/firstproject-0.0.1-SNAPSHOT.jar
for making new build from existing sources and running it from over there
--------
mvn spring-boot:run
for running without jar

Endpoints:<br/>
/API/users/{id} : GET<br/>
/API/users      : PUT<br/>
/API/users      : POST<br/>
/API/users/{id} : DELETE