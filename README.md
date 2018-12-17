# SpringBoot Applications

The aim of this repository is to learn **Spring Boot** and develop a CRUD application regarding a Car Repair Shop so as to deeply understand design patterns regarding the 3-tier Architecture used by this MVC framework.


During server's startup, Spring Boot will automatically load 5 tuples of dummy data for each table so as to adequately Unit Test the application. When the server's proccess is terminated all data will be deleted automatically ([Spring Boot Documentation: Database Initialization](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html)).

After importing the project, simply fire up your server (tomcat's port is set to 8000) and click the following:



## Login Page

Currently the Login page is not validating via the database fields but in memory. In order to login [username/password] :

	- User_Role: user/user
	- Admin_Role: superuser/superuser

## [Index Page](http://localhost:8000/carshopwebapp/) 

The index page consists of the following:

-Contributors page

-Display All Contributors

-User/Owner of a Car page

	a. Create New User Entry

	b. Display All Entries

	c. Update/Delete an Entry

-Car Repair Shop page 

	a. Create New Repair Entry
	
	b. Display All Entries
	
	c. Update/Delete an Entry
	
	
-Search the Database (via User Input) 


	a. For a user's surname display all available db records
	
	b. For a user's AFM (National Insurance number) display all available db records
	
	c. For a user's Email Adress display all available db records
	
	
The project was developed in collaboration with: [Giorgos Anagnostakis](https://github.com/GiorgosAnagnostakis),  [Kostas Beroukas](https://github.com/KostasGit) and [Katerina Manioudaki](https://github.com/katerinaeks).

