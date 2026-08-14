||JPA & Hibernate implemented in Eclipse||

JPA:
JPA is nothing but Java Persistence API which is used to provide the specification for Object Relationship Mapping (ORM) in Java.
JPA defines entity mapping using 
@Enitity : 
@Table : to assign the table name not to create the table 

JPA defines the relationships using @OneToOne,@OneToMany, @ManyToMany
JPA defines the persistence operations like persist, merge , remove.

Hibernate:
It is a ORM tool which is used to implement the JPA path.
Hibernate provides the actual code that execute the JPA specification.
Hibernate maps java objects to database tables. It reduce the JDBC code and automatically handle the CRUD operations

Advantage of Hibernate:
1) Less Code 
2) Database Independant 
3) Cashing support 
4) Transaction managament

Architecture of Hibernate:-

Java Application
|
Configuration : It is used to read hibernate.cfg.xml, It stores database configuration.
|
SessionFactory : Create session objects, One session factory per database.configures the database(connection).
|
Session : Used for CRUD operation, lightweight object.used for query.
|
Transaction : Ensures data consistency, commit and rollback.
|
Database : Execute HQL(Hibernate query language) or SQL(Structured Query Language).

Hibernate Lifecycle:
1) Transient : object creation using new
2) Persistent : object save using session.save()
3) Detached : session closed
4) Removed : deleted from database

org.apache.maven.arc package to choose on eclipse
we use pom file in maven to build the project update the project and manage the project the pom is created automatically

Spring is a java framework which is used to develop a enterprise applications
It provide the diff type of features like 
IOC, DI, AOP, Transaction Management
with the help of this spring can connect with the database and web application.

What is prototype
- it is an object that provides inherited properties and methods to another objects.
- ⁠Js prototype is used to implement inheritance and method chaining.
- ⁠js does not support multiple inheritance
-
what is prototype chaining
- prototype chain is a mechanism which searches for properties and methods who link prototype object, it finds them or reaches null
- 
Why prototype is important 
- to enable inheritance save memory by sharing methods
- NOTE : javascript inheritance is prototype based, every object has prototype and when property of method is not found in the object itself js looks for in prototype chain.

IMP
1))  IOC - Inversion of control
-It is a spring container creates,configures and manages the java objects instead of user creating it manually.
-IOC is responsible for managing and assemble the object.

How IOC works?
Program starts
Spring container (reads configuration)
inject dependencies
returns object to application

IOC container
1) BeanFactory - create beans(object)
2) ApplicationContainer - advance container, supports enterprise features

2)) DI - Dependency Injection
: DI provides the required object to the class instead of class creating it.


tight coupling - manually creating objects,mandatory creating pbject to call teh methods of diff class.
loose coupling - does not need to create object of the class manually just create a constructor pass the reference of diff class in that constructor.

<bean></bena> is object and <beans></beans> denotes schema location
maven is one type of testing opensource frame 
it contains pom.object.module it contains all the dependencies that nromal project does not contains that is why we need maven projects for java applications
pom contains the project name objects packages and all
spring web is used when you want to run angular projects it is mendatory

SpringBoot:-

It is an extension of the spring framework that helps developers build java application quickly with minimal configuration.

Features of SpringBoot:
1) Auto Configuration
2) Starter dependencies
3) Embedded server
4) Rapid development : we are removing xml configuration and boilerplate code.

-SpringBoot is used to create RestAPI’s 
-RestAPI is an interface that enable communication between client and server using http methods like get, post, put, patch, delete.
get : retrieve data from database
post: create new data
put: update existing data
delete: remove the data
patch : update certain field
-RestAPI means representational state transfer application programming interface.

What is Lombok :-
lombok reduces boilerplate code using @data and other components it has.

there are two type of repo in springboot
JPA repo - paging , and all crud methods and other methods as well, used to handle all the queries
CRUD repo - update get post delete ect


#DTO: Data Transfer Object
-It is used to transfer data between the client and server without exposing your entity directory
Uses to:
- For security
- transfer only required data
- ⁠validation
- ⁠separate database model from API model
- ⁠custom response
If i dont want to expose the real data i use this DTO class in which we will only add those data which to be shown and confidential and important data will remain in main class as it is

when we create this is creation flow  ( entity->repository->service->controller )
when we execute it it will reverse the flow  ( controller-service-repository-entity )

Response Entity:
-it is used to return complete http reponse from RestAPI
-It allows you to control http headers,status code, and response body
-syntax : ResponseEntity<T> T=type of argument
<img width="1402" height="1122" alt="image" src="https://github.com/user-attachments/assets/5ca508e6-76d3-4e3c-a6ff-f923da7db488" />


