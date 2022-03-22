package edu.odu.cs.cs350;

public class Block {
    private String rawBlock;

    public Block(String block) {
        rawBlock = block;
    }

    public String getRawBlock() {
        return rawBlock;
    }

    private Array<String> tokens;
}
