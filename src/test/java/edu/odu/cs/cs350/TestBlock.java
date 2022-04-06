package edu.odu.cs.cs350;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBlock {
    @Test
    public void testConstructor() {
        Block b = new Block("this is my string");
        String st = b.getRawBlock();
        ArrayList<Token> testTokens = b.getTokens();
        assertEquals(st, "this is my string");
        assertThat(testTokens, nullValue());

    }

    @Test
    public void testBreakIntoTokens() {
        Block testBlock = new Block("This is my test string, with punctuation!");
        ArrayList<Token> testTokens = new ArrayList();
        testBlock.breakIntoTokens();
        testTokens = testBlock.getTokens();
        assertEquals(testTokens.size(), testBlock.getTokenSize());
        assertEquals(testTokens.get(0).getRawToken(), "This");
        assertEquals(testTokens.get(4).getRawToken(), "string,");
        assertEquals(testTokens.get(6).getRawToken(), "punctuation!");
    }
}
