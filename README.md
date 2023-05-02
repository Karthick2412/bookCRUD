What's inside
This project is based on the Spring Boot project and uses these packages :

*) Maven
*) Spring Core
*) Spring Data (Hibernate & MySQL)

Installation
-----------------------------------------------------

The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies


Database configuration
-----------------------------------------------------

Create a MySQL database with the name springbootdb and add the credentials to /resources/application.properties.
The default ones are :

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/bookstore
spring.datasource.username = root
spring.datasource.password = 
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl


Usage
-----------------------------------------------------

Run the project through the IDE and head out to http://localhost:8080

run this command in the command line:

mvn spring-boot:run

REST POINT URL 
-----------------------------------------------------

BOOK - 
{
	create      -> "http://localhost:8080/book/new"                  method : POSt
	book_list   -> "http://localhost:8080/book/findall"              method : GET
	find_by_id  -> "http://localhost:8080/book/{UUID_ID of book}     method : GET 
	book_update -> "http://localhost:8080/book/update"               method : PUT
	delete_book -> "http://localhost:8080/book/delete/{UUID of book} method : DELET

}
