package edu.odu.cs.cs350;

import java.util.ArrayList;

public class Block {

    private String rawBlock;
    private ArrayList<Token> tokens;

    /**
     * 
     * @param block is the string containing all text in a block
     */
    public Block(String block) {
        rawBlock = block;
    }

    /**
     * @return a raw block with no tags
     */
    public String getRawBlock() {
        return rawBlock;
    }

    /**
     * @return size of list of tokens
     */
    public int getTokenSize() {
        return tokens.size();
    }

    /**
     * Breaks a block of text down into individual words called tokens
     */
    public void breakIntoTokens() {
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

    }

    /**
     * @return a list of tokens
     */
    public ArrayList<Token> getTokens() {
        return tokens;
    }
}
