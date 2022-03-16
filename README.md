# Project-03
# Name Extraction Project
CS350, Old Dominion Univ., Spring 2022
Team Project 03
* [Stories](https://trello.com/b/4WNrLBWO/cs-350-group-project)
# Initial Draft
```
@startuml

title Classes - Class Diagram


class File {
  +void readFile()
  +void displayFile()
  +bool checkName()
}

class Name {
  +void findNames()
  +void tagNames()
}

class Library {
  Collection<names>
  +void inputNames()
  +bool checkDuplicates()
}

class TestInterface {
  
}



@enduml
```
