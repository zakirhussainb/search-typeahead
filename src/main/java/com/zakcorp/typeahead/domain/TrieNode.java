/*
 * Copyright  : ZakCorp (c) Zakir Hussain
 * License    : MIT
 * Maintainer : zakirhussainb2693@gmail.com
 * Stability  : stable
 */

package com.zakcorp.typeahead.domain;

public class TrieNode {
    public TrieNode[] child;
    char label;
    public boolean isLast;
    public String word;
    private static final int ALPHABET_SIZE = 26;

    public TrieNode() {
        this.child = new TrieNode[ALPHABET_SIZE];
    }

    public TrieNode(char l) {
        this();
        this.label = l;
    }

}
