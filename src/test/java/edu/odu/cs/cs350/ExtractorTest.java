package edu.odu.cs.cs350;

import java.util.Arrays;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ExtractorTest {

    @Test
    public void TestfindNames() {

        String str = "This is David test string.";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        String rSt = str.replace(list.get(3), "<name>" + list.get(3));
        String finalSt = rSt.replace(list.get(4), list.get(3));
        finalSt = rSt.replace(list.get(4), list.get(4) + "</name>");

    }
    /*
     * @Test
     * public static String TestmarkPersonalNames(String textBlock) {
     * 
     * String testBlock = "This is David block test string.";
     * String names = testBlock.findNames();
     * System.out.println("<PER> David </PER>");
     * 
     * }
     */
}