package edu.odu.cs.cs350;

import java.util.Arrays;
import java.util.*;

public class Extractor {

@Test
public void TestfindNames() {

String str = "This is David test string.";
ArrayList<String>list = new 
ArrayList<>(Arrays.asList(str.split(" ")));
String rSt = str.replace(list.get(3), "<name>" + list.get(3));
String finalSt = rSt.replace(list.get(4),list.get(3));
String finalSt = rSt.replace(list.get(4), list.get(4)+"</name>");

}

@Test
public static String TestmarkPersonalNames(String textBlock) {

String testBlock =  "This is David block test string.";
String names = testBlock.findNames();
System.out.printIn("<PER> David </PER>");


}




}