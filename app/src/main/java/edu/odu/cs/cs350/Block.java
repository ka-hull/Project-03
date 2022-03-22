package edu.odu.cs.cs350;

import java.util.*;

public class Block {
    private String rawBlock;

    public Block(String block) {
        rawBlock = block;
    }

    public String getRawBlock() {
        return rawBlock;
    }

    private ArrayList<String> tokens;
}
