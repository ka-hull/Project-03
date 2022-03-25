package edu.odu.cs.cs350;

import java.util.*;

public class Block {
    private String rawBlock;
    private ArrayList<Token> tokens;

    public Block(String block) {
        rawBlock = block;
    }

    public String getRawBlock() {
        return rawBlock;
    }

    public int getTokenSize() {
        return tokens.size();
    }

    public ArrayList<Token> breakIntoTokens() {

        tokens = new ArrayList();
        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < rawBlock.length(); i++) {
            // once a space or new line is reached, create and add a token to token
            if (rawBlock.charAt(i) == ' ' || rawBlock.charAt(i) == '\n') {
                Token tempToken = new Token(temp.toString());
                tokens.add(tempToken);
                temp.delete(0, temp.length());
            }
            // if the character is not a space or new line, add character to temp
            else {
                temp.append(rawBlock.charAt(i));
            }
        }

        // add the last token once end of rawBlock is reached
        Token tempToken = new Token(temp.toString());
        tokens.add(tempToken);

        return tokens;
    }
}
