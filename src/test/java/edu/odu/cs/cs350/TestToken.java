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
        String w = t.getWordClassification();
        ArrayList<FeatureSet> testFeatures = t.getFeatures();
        assertEquals(s, "string.");
        assertThat(w, nullValue());
        assertThat(testFeatures, nullValue());
    }

    @Test
    public void testDetermineWordClassification() {
        Token t = new Token("Mr");
        t.determineWordClassification();
        String s = t.getWordClassification();
        assertEquals(s, "Part of a name");
    }
}
