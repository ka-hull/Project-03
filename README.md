# Project-03
# Name Extraction Project
CS350, Old Dominion Univ., Spring 2022
Team Project 03
* [Stories](https://trello.com/b/4WNrLBWO/cs-350-group-project)
# Initial Draft
```
@startuml

title Classes - Class Diagram


class Driver {
  +string readBlock(BufferedReader)
  +void readBlocks(BufferedReader)
  +void displayMarkedUpBlock()
  +bool checkName()
}

class Block{
//Breaks up string block into tokens 
  String rawBlock
  Collection<Token> tokens
  
  breakIntoTokens()
}

class Token{
//supply tokens and token interfaces 
  String rawToken
  ? nameClassification
  FeatureSet features
}

class FeatureSet{
  merge()
}

class Extractor {
  +void findNames()
  +void markPersonalNames()
}

class Gazetteer {
  Set<string> known
  +void acquireList()
  +bool contains(string)
}

class TestInterface {
  
}



@enduml
```
