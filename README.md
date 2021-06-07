# Vaccine-v1.0

  <br />
  <br />
  
## *Project description & abilities*

**Vaccine** is a vaccination consent form. 
<br />
<br />



## *Installation*

*Software required to run this project:*

-	 **[JAVA 8](https://www.java.com/en/download/)**  / [Installation instructions](https://www.java.com/en/download/help/ie_online_install.xml)
-	 **[Eclipse](https://www.eclipse.org/downloads/)**  / [Installation instructions](https://www.eclipse.org/downloads/packages/installer) 
	or 
-	 **[Intellij IDEA](https://www.jetbrains.com/idea/download/)** / [Installation instructions](https://www.jetbrains.com/help/idea/installation-guide.html)  

-	 **[MySQL](https://dev.mysql.com/downloads/)** / [Installation instructions](https://www.sitepoint.com/how-to-install-mysql/#:~:text=Step%201%3A%20download%20MySQL,a%20tool%20such%20as%20fsum.)  
-	 **[Apache Tomcat ](https://apache.mirror.ba/tomcat/tomcat-9/v9.0.41/bin/apache-tomcat-9.0.41.exe)** / [Installation instructions](https://beginnersbook.com/2017/06/how-to-configure-apache-tomcat-server-in-eclipse-ide/)  

<br />

## *Usage*

Once Tomcat server is configured, project can be run in your IDE by right click on **index.jsp** in project menu (WebContent) > Run as > Run on server.
It should navigate you to homepage.  After typed user personal data at the end of the page you should get confirmation message.

*At homepage you can choose* :

•	Drop menu to **create** airline, airport or flight;

•	Drop menu to **list** airline, airport or flight;
<br />
<br />
## *How to create an airline, airport or flight?*
<br />

***Validation mechanism*** is very important when it comes to customer's input data.

   •	 An airport must have a name consisting of exactly three alphabetical characters. No two airports can have the same name.

   •	 An airline has a name that must have less than 6 alphabetic characters. No two airlines can have the same name.

   •	 Each flight consists of seats organized in rows. Each row is labeled with ("**A**" , "**B**" , "**C**" , "**D**" , "**E**" , or "**F**"). Each row has number of seats in row.

   •	 Every flight has an airport, airline origin destination and seats.
                 
<br />
<br />

   **Airline creator** has 3 main airline data (*Airline codename, callsign* and *country*). After typing data you can create airline by clicking on "Create" button.
<br />

   **Airport creator** has 5 main airport data (*Airport codename, fullname, type, city* and *country*).
<br />

   **Flight creator** has 8 main informations which are needed to successfully create flight.   (*Airline codename, Airport codename, Destination airport codename, Flight class, Date of flight, Latest seat row, Seats per row* and *Flight price*)
   
   When it comes to creating flight. this mechanism offers drop menu with airlines and airports based on earlier stored data in order to prevent unexpected bugs or typos.
 <br />
 
   ## *How to view stored airlines, airports or flights?*
<br />

   Once airline, airport and flight are created, user can **list data from database**. There are functions to **remove, modify** or **view** specific airline, airport or flight.    (User can also view certain airline, airport or flight by clicking on its name in table)
  <br />
  
   ## *How to book a flight*
  <br />
  
   **Booking a flight** should be done by entering specific flight from list. 
   If entered data is valid page should be redirected to ticket preview page. 
