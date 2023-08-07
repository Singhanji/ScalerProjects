# Input to Controller

**Q1: Should we provide one parameter or many parameters?**
- Ans: One Parameter: one request DTO (which has all inputs as fields inside it) 
- Always wiser to pass one parameter, we can wrap multiple parameters in an object 
- We can now easily pass the object as a parameter in the method of the Controller.
- **For that purpose, we have DTO (Data Transfer Object)**

# How are DTO used in Parking Lot?
- Our 1st DTO for 1st Req. is GenerateTicketRequestDTO
- The reason to create this class is—To represent the request to Generate Ticket function.


- **The Advantages** of having GenerateTicketRequestDTO class is-If we add more parameters in the future in that class, our code will still compile. So, it is better for future modification.

 
- **The Disadvantages** of not having GenerateTicketRequestDTO class is-our code could start breaking (it won't compile) if add any new parameter in the method of the TicketController class. 
- We have extra overhead of space and time creating it.


**Q2: Instead of DTO, can't we use models for input in controllers?**
- Ans: SRP(Everything has defined responsibility) No, because models represent Class Diagram and they will help create tables in the database.
- model represent Schema design, the entire problem statement. 
- **2 main reasons to have DTOs in communication and NOT models:**
- 1. Necessary information: No models have all 3 inputs together.
- 2. Sufficient information: Models which have extra information will confuse the client while making a request.
- 3. Models have a single responsibility of representing a schema of problem.   

**Q2: Instead of DTO, can't we use models for output in controllers?**
- Ans: No, for the same reasons as in Q2.
- Also, ResponseDTO helps us give a better response in case of an exception.

# Things to Remember:
- Do not leave Backend application without handling exception.
- So all controller methods will always have code wrapped inside try catch, then all exceptions will be handled.
- If we do not handle any exception, our application crashes at the client side which will lead to surprise the client.
- But if exception happens we can give them a failure message, eg: 403 you are not authorized to make this request. 
- So, showing the error message is less nasty than crashing the application to client.

# Pain points in ParkingLot:
- 1. Getter setters have to be added manually
- 2. Dependency Resolution: Do we need to figure out who depends on what, so there is a framework to solve it? Yes.