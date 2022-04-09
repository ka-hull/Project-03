package edu.odu.cs.cs350;

import java.util.Arrays;
import java.util.*;

public class Extractor {

@Test
public void TestfindNames() {


String str = "This is my test string.";
ArrayList<String>list = new 
ArrayList<>(Arrays.asList(str.split(" ")));
String rSt = str.replace(list.get(3), "<name>" + list.get(3));
String finalSt = rSt.replace(list.get(4),list.get(3));
String finalSt = rSt.replace(list.get(4), list.get(4)+"</name>");
System.out.printIn(rSt);
System.out.printIn(finalSt);


}

@Test
public static String TestmarkPersonalNames(String textBlock) {

String textBlock =  "Test block string to see if it works.";
String names = textBlock.findNames();
System.out.printIn("<PER>" + names + "</PER>");
return names:




}




}