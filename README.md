# JMP-6_2

Write a class that receives all the readPerson(String name) calls
The class should delegate the request to the DB or File if no person with the matching name was already read.
Otherwise it should return a cached instance of that person.