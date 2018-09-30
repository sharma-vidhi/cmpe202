## Din Tai Fung Design Patterns 

#### CRC Cards

----------------------------------
Class: 
- manager
(subject/client)

Responsibility:
- maintain Customer detials(like id, name, phone number, members, status) and customer sequence
- send request to table handler
- notify customer on table availablity

Collaboration:
- table
- customer
-----------------------------------


-----------------------------------

Class:
- customer
(observer)

Resposibility:
- signup with the details(like name, phone number, members)
- send status on receving table availaity update

Collaboration:
- manager
------------------------------------

-------------------------------------
Class:
- table handler
(handler)

Responsibility:
- maintains a list of available table(with table number and table size)
- handles manger's requests and returns table number

Collaboration:
- manager
--------------------------------------

#### Design Patterns
1. Observer Pattern
- As, there is one to many relationship between manager and client observer design pattern can be used. Manager maintians customer's details and notifies customer's regarding the table availability.
- Manager acts as "subject", maintians list of customers(as "observers"). Also, manager notifies the state change(status of the table availability) to customers.


2. Chain of Responsibility
- According to the requirement table size should match the customer memeber size, if the first available is not as the same size as requested by current customr then other table which is as per the customer requirement should be processed. Hence, using chain of responsibilty design pattern can used to maintain the avialable table's and handle the customer request. 
- Manger behaves as client and requests for table number(based on customer's requirements) from table handler. Table handler  maintains a list of all the tables and dispatches the reuests amoung concrete handle(first available table).

