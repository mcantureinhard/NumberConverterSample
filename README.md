# NumberConverterSample

## Task 1: The App

### Frontend

Should be implemented as an SPA. That app should allow users to enter a number into an input field and convert it into another format. Your UI should allow for converting numbers (1) from decimal to roman as well as (2) from binary to roman. The app should include a NumberConverter component that would render a UI control to toggle between conversion modes. As your co-workers will need the NumberConverter component for other use cases as well, it should be written in a generic and reusable way to allow extending it with new conversion operations (e.g., hexadecimal to roman). You do not have to implement these other use cases; but please make sure using NumberConverter in other contexts would require minimal changes to your code. 

### Backend

The actual conversion should happen server-side, so there should be a Spring-based server app listening to requests from the client and implementing the conversion. The server should also allow for extension with minimal code modifications (on both sides).

## Task 2 (optional): Audit Log

All conversions executed via the frontend should have an audit trail in the backend store. You can choose and implement any store you like, whether it is a flat file or a RDBMS (in-memory or persistent). Each audit record should include a timestamp, a type of conversion, incoming and outgoing params/results. 

## Coding Guidelines

We are mainly interested in a way you solve this problem on a conceptual level. Therefore, we care more about code quality (cleanliness), separation of concerns and maintainability than about a polished UI design. Try applying OOP principles such as Dependency Injection thoughtfully.

## Extra credits
 
Extra credit for tests provided (though we do not expect a 100% coverage).
