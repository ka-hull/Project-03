package edu.odu.cs.cs350;

import java.util.ArrayList;

public class Token {

    private String rawToken;
    private String wordClassification;
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
     * Determines whether the token is part of a name or not
     * 
     */
    public void determineWordClassification() {
        FeatureSet feature = new FeatureSet(rawToken);
        boolean prefix = feature.isPrefix(rawToken);
        boolean firstName = feature.isFirst(rawToken);
        boolean lastName = feature.isLast(rawToken);
        if (prefix == true)
            wordClassification = "Part of a name";
        else if (firstName == true)
            wordClassification = "First Name";
        else if (lastName == true)
            wordClassification = "Last Name";
        else
            wordClassification = "Not a Name";
    }

    /**
     * 
     * @return the word classifcation of a token
     */
    public String getWordClassification() {
        return wordClassification;
    }

    /**
     * 
     * @return a list of features for a token
     */
    public ArrayList<FeatureSet> getFeatures() {
        return features;
    }
}
