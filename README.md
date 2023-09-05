# LeadHive
Lead Management system developed using the Spring Boot framework and MongoDB as the database. Here's a brief overview of what this Lead Management application does:

Purpose:
The primary purpose of this application is to manage and track leads. Leads typically refer to potential customers or contacts who have shown interest in a product or service but have not yet become customers.

Functionality:
Create Lead: Users can create new leads by sending a POST request with lead information (name, email, phone, etc.) to the appropriate endpoint.

Retrieve Leads: Users can retrieve a list of all leads or specific leads by sending GET requests to the respective endpoints.

Update Lead Status: The application allows users to update the status of a lead by sending a PUT request with the lead's ID and the new status.

Delete Lead: Leads can be deleted from the system by sending a DELETE request with the lead's ID.

Technology Stack:
Spring Boot: Used for building the application, handling dependency injection, and providing a framework for RESTful web services.

MongoDB: A NoSQL database used to store and manage lead data.

HTTP: The application communicates with clients (e.g., a web browser or mobile app) using HTTP requests and responses

