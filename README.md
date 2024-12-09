# TAXI RESERVATION SYSTEM

#### This is java - based application that dynamically allocates taxis for the customers. Consistently maintains and updates the current position of the taxi and the earnings of each taxis.
<hr>

## Technologies Used:
<ul>
  <li>Java</li>
  <li>Object Oriented Programming</li>
  <li>Data Structures</li>
  <li>GitHub</li>
</ul>

## System Design:

##### Main.java:  Handles user input and provides options for booking taxis, viewing details, or exiting the system.
##### BookTaxi.java:  Manages taxi allocation and booking history.
##### Taxi.java:  Represents individual taxis with attributes like location, earnings, and booking details.

## Special features:

#### Dyanmmic Allocation:  
A list of taxis ensures scalability, with the system dynamically creating and assigning taxis up to a predefined limit (e.g., 4 taxis).

#### Real - time Updates:
Each taxi's status, including its current position, earnings, and booking history, is tracked and updated in real-time.

## User Interaction:
<ul>
  <li>Users can book a taxi by specifying pickup and drop locations (as alphabetic points) and the desired pickup time.</li>
  <li>Customers are provided with a confirmation that includes the allocated taxi number or a notification if no taxis are available.</li>
  <li>The system allows users to view a detailed history of bookings and taxi performance, including earnings and current positions.</li>
</ul>

## Taxi Allocation Mechanism:
1) Initially there are 6 locations(A,B,C,D,E).
2) The distance between each point is 15kms.
3) It takes 60 minutes to travel from one locations to another.
4) Each Taxi charges Rs.100 minimum for the first 5kms and Rs.10 for each subsequent kilometers.
5) The taxi nearest to the location of the customer is allocated.
6) If two or more taxi is present at the same distance the taxi with the least earnings is allocated.
7) If there is no taxi available, booking will be rejected.
 
