package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBlock {
    @Test
    public void testConstructor() {
        Block b = new Block("this is my string");
        String st = b.getRawBlock();
        assertEquals(st, "this is my string");

    }

    @Test
    public void testBreakIntoTokens() {

    }
}
