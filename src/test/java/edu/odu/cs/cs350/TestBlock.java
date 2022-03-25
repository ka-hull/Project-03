package edu.odu.cs.cs350;

import java.util.*;
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
        Block testBlock = new Block("This is my test string, with punctuation!");
        ArrayList<Token> testTokens = new ArrayList();
        testTokens = testBlock.breakIntoTokens();
        assertEquals(testTokens.size(), testBlock.getTokenSize());
        assertEquals(testTokens.get(0).getRawToken(), "This");
        assertEquals(testTokens.get(4).getRawToken(), "string,");
        assertEquals(testTokens.get(6).getRawToken(), "punctuation!");
    }
}
