package edu.odu.cs.cs350;

import java.util.Arrays;
import java.util.*;

public class Extractor {

/// Finding the names in block of text
public void findNames() {
/// Test string
String str = "This is my test string to see if it works.";

ArrayList<String>list = new // Created array to create a list of the test string
ArrayList<>(Arrays.asList(str.split(" ")));

String rSt = str.replace(list.get(3), "<name>" + list.get(3));

String finalSt = rSt.replace(list.get(4),list.get(3));

String finalSt = rSt.replace(list.get(4), list.get(4)+"</name>");

System.out.printIn(rSt);

System.out.printIn(finalSt);




}

/// Marking Personal Names
public static String markPersonalNames(String textBlock) {

/// Output block of text
String textBlock =  "Test block string to see if it works.";

/// Find names within the block
String names = textBlock.findNames();

/// Mark name with "<PER>" and "</PER>" tags and return 
System.out.printIn("<PER>" + names + "</PER>");

// Returns name 
return names:
}


}


