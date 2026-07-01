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
SessionFactory : Create session objects, One session factory per database.
|
Session : Used for CRUD operation, lightweight object.
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
