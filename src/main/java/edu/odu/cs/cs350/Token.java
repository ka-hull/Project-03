package edu.odu.cs.cs350;

import java.util.ArrayList;

public class Token {

    private String rawToken;
    private ArrayList<FeatureSet> features;

    /**
     * @param token is a string containing a word to set as rawToken
     */
    public Token(String token) {
        rawToken = token;
    }

    /**
     * @return a token contisting of a word
     */
    public String getRawToken() {
        return rawToken;
    }

    /**
     * @return a list of features for a token
     */
    public ArrayList getFeatures() {
        return features;
    }
}
