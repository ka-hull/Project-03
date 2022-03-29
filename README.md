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
  //Default Constructor
  +private string block; 
  +public string readBlock(BufferedReader)
  +public void readBlocks(BufferedReader)
  +pubilc void displayMarkedUpBlock()
  +public bool checkName()
  //to string 
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
  //Array for features (punctuation, capitals, etc)
  merge()
}

class Extractor {
  +void findNames()
  +static String 
        markPersonalNames(String textBlock)
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
