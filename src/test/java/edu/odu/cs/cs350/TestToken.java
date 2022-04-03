package edu.odu.cs.cs350;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestToken {

    @Test
    public void testConstructor() {
        Token t = new Token("string.");
        String s = t.getRawToken();
        assertEquals(s, "string.");
    }
}
