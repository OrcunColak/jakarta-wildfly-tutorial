# Read me

The original idea is from  
https://levelup.gitconnected.com/rest-maven-java-17-wildfly-30-51d1a465cae5

Type the command below to create the war file

```
mvn clean package
```

Type the command below to deploy the war file

```
mvn wildfly::deploy
```

Type the command below to undeploy the war file

```
mvn wildfly::undeploy
```