# Config-Server-Example

### Usage
Spring Cloud Config provides server-side and client-side support for externalized configuration in a distributed system. With the Config Server, you have a central place to manage external properties for applications across all environments. 

### Guide
Its a simple spring boot project with spring-cloud-config dependency . Annotation ```@EnableConfigServer``` is added in application file to enable/run this as config-server. ```spring.cloud.config.server.git.uri``` property is used to specify git URL where our properties are stored, instead of git URL we can also put local file path as value of this property.

### Testing from Postman.
Following are the endpoint exposed by config-server .We can hit this endpoint from Postman or browser and check whether config-server has successfully started or not.
```
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```
Here ```application``` is the value of ```spring.config.name``` which by default all spring-boot application has its value as "application".
If we want our client application to look into application specific property then we need to create a new property say ```myapp.properties``` and add property ```spring.application.name=myapp``` in ```bootstrap.properties``` file in client side.</br></br> ```profile``` is an active profile (or comma-separated list of properties), </br> </br> ```label``` is an optional git label (defaults to ```master```.)

#### Example
Lets say we have three property on our git. application.properties , myapp.properties and one profile specific for test profile with name myapp-test.properties then our sample endpoint would be as following.
</br>http://localhost:1111/aplication/default/master(optional)
</br>http://localhost:1111/myapp/default/master  (will load value from myapp.properties)
<br>http://localhost:111/myapp/test/master (will load value from myapp-test.properties)



### Reference Documentation
For further reference, please consider the following sections:
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
