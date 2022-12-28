
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:16-alpine-jdk

MAINTAINER javiermorales

COPY target/PortfolioBackEnd-0.0.1-SNAPSHOT.jar PortfolioBackEnd-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/PortfolioBackEnd-0.0.1-SNAPSHOT.jar"]
