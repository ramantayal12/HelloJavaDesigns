# System Design

- process of defining different elements of the system. 
- include things like architecture, components, modules
- communication between all the aspects ( communication here refers to transfer of data )
- how effectively data will flow between the system 
- all this is done to achieve the business requirement

## - two types of system design
- high level design
- low level design

### - high level design

- overall design for the whole application, involves breaking of application in smaller components
- hld comes early on design and is based on the requirement doc and scale estimation.
- hld involves designing of both functional and non-functional requirements
- involves creation of architectural components will talk to each other
    - understanding the problem statement 
    - requirement analysis
        - functional requirements : related to functionality of application 
        - non-functional requirement : better maintenance/scalability/better experience
    - capacity estimation : decide the infrastructure needed to run the application ( load testing ) 
    - define the different components of the whole application and their communication
- includes designing of these things 
  - principle components 
  - database 
  - services
  - relationship between module/component


Example : Checkout Experience of a customer 

Requirement - able to add items to the cart,
load expecting - 2000 requests per second, components - cart service, checkout service,
inventory service, authentication service, payment service, shipment service 

### - low level design
  - detailing of each component
  - lld is based on hld
  - lld focus on how specific requirements will be implemented

  - includes design of following components 
    - ip address 
    - class diagrams, sequence diagrams, activity diagrams 
    - vlan and port numbering 
    - algorithm and pseudocode 
    - different classes, interfaces and relationship between them 
    - relationships between modules and system features 
    - design and implementation constraints 

## software development life cycle ( sdlc )
1. Requirement Analysis
2. Planning
3. Design
4. Build 
5. Code Testing 
6. Deployment/Maintenance