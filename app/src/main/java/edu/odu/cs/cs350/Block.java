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

    public ArrayList<Token> breakIntoTokens() {
        // still working on splitting the block into tokens
        // tokens = new ArrayList<Token>(Arrays.asList(rawBlock.split(" ")));

        return tokens;
    }
}
