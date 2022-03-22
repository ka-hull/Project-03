package edu.odu.cs.cs350;

//import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.*;
import org.junit.platform.commons.annotation.Testable;

public class TestBlock {
    @Testable
    public void testConstructor() {
        Block b = new Block("this is my string");
        String st = b.getRawBlock();
        assertEquals(st, "this is my string");

    }
}
