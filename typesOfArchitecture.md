# types of architecture

- websites - static content ( read only features)
    Example : blogging websites
- web-applications - read + actions(write) 
    Example : facebook

- WebApplication contains 3 layers

: 1. FrontEnd/ UI
: 2. Backend/ Business Layer ( logic needed to express the data to frontend)
: 3. Data Storage Layer

- Architecture :  internal design details for building web application 

## Monolithic Architecture

- codebase of all 3 layers should be written together 
- should be deployed together
- for each update the complete code has to be deployed again
- as all the layers are tightly coupled together it would be difficult to modify the code 
- Use of Monolithic Architecture
  1. when we have latency sensitive application ( latency : total time taken for request sent, request processed and request received )
  2. comparatively easy to secure monolithic architecture
  3. integration testing is easier

## Micro-Services
- multiple smaller applications 
  - single responsibility 
  - loose coupling
- one service can only communicate to other database through apis only 

- Advantages
  - selective scaling is easy 
  - loose coupling 
  - low deployment time 
  - multiple tech stack 

- disadvantages 
  - separate machines ( costly infrastructure )
  - integration testing is complex 
  - security is expensive and complex 
  - higher latencies because of additional network calls
  