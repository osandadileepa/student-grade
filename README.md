# Getting Started

Test project to display student assignment information and grade based on the answer each and every student provide.

# Build and Deployement instruction

## Development Enviroment setup

Make sure following are met

- JDK 1.8
- Docker and Docker Compose
- Node 12.13.1
- Angular CLI 8.3.xxx
- MySQL 5.7.xx


## Mysql User credentials

- Following username and password should include
  username: root,
  password: root
- Mysql instance should be exposed in localhost in port 3306
- jdbc:mysql://localhost:3306/

## Appication source and development envioronment

- Backend available at src/main/java
- Frontend available at src/main/webapp
- MySQL instance will be available by using docker-compose file at src/main/docker(command : docker-compose up)
- Backend will be available by using following command at the project root.
```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```
- Frontend will be served at http://localhost:4200 by executing following command at src/main/webapp

```bash
ng serve
```

## Build application binary

In the project root directory execute the following bach script

- Angular CLI above mentioned version should be available globally in order to build to work.

```bash
./build.sh
```

## Start the application

- MySQL instance should available at locally, port 3306 with root username and root password in order to jar file to work.

```bash
java -jar -Dspring.profiles.active=dev target/student-grade-0.0.1-SNAPSHOT.jar
```

After executing above command application is presented at http://localhost:8080


## To excute docker based containerized deployement

- Run the docker-compose.yml file using the following command

```bash
docker-compose up --build
```

- After few munutes application is available at http://localhost:8080