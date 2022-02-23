# 說明
參考 https://atbug.com/hello-quarkus/

筆者開發環境

Windows 10

Java 17

Maven 3.8.4


開發指令(Windows平台)
```shell script
mvn io.quarkus:quarkus-maven-plugin:2.7.1.Final:create -DprojectGroupId=com.hellojava.quickstart -DprojectArtifactId=quarkus-getting-started -DclassName="com.hellojava.quickstart.GreetingResource" -Dpath="/hello"
```

```shell script
cd quarkus-getting-started
```

開發模式具有live reload(hot reload)功能
```shell script
mvnw compile quarkus:dev
```
使用瀏覽器連線到 http://localhost:8080/hello

使用瀏覽器連線到 http://localhost:8080/hello/greeting/AABBCC

單元測試指令
```shell script
mvnw test 
```

打包指令
```shell script
mvnw package
```

專案加入Spring Web MVC支援
```shell script
mvnw quarkus:add-extension -Dextensions="spring-web,resteasy-jackson"
```
參考

https://quarkus.io/guides/spring-web

# quarkus-getting-started Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-getting-started-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
