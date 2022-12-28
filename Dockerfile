
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:16-alpine-jdk

MAINTAINER javiermorales

COPY target/demo-0.0.1-argentinaprograma.jar demo-0.0.1-argentinaprograma.jar

ENTRYPOINT ["java","-jar","/demo-0.0.1-argentinaprograma.jar"]
