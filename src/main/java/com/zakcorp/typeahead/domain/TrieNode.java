package com.zakcorp.typeahead.domain;

public class TrieNode {
    TrieNode[] children;
    char label;
    boolean isLast;
    String sentence;
    private static final int ALPHABET_SIZE = 26;

    public TrieNode() {
        this.children = new TrieNode[ALPHABET_SIZE];
    }

    public TrieNode(char l) {
        this();
        this.label = l;
    }

}
