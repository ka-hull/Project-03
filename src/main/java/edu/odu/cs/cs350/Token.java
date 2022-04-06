package edu.odu.cs.cs350;

public class Token {

    private String rawToken;

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
}
