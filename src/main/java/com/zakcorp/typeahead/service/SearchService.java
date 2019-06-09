package com.zakcorp.typeahead.service;

import com.zakcorp.typeahead.domain.TrieNode;
import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

@Service
public class SearchService {
    private TrieNode root;

    public SearchService() {
        this.root = new TrieNode(' ');
    }

    public void insertNewWord(String word) {
        System.out.println("word..." + word);
        char[] cArr = word.toCharArray();
        TrieNode node = root;
        TrieNode tn = null;
        int index = 0;
        do {
            tn = node.child[cArr[index] - 'A'];
            if(tn != null) {
                node = tn;
                index++;
                if(index >= word.length()) {
                    node.isLast = true;
                    node.word = word;
                    return;
                }
            }
        }while(tn != null);
        for(; index < cArr.length; index++) {
            node.child[cArr[index] - 'A'] = new TrieNode(cArr[index]);
            node = node.child[cArr[index] - 'A'];
        }
        node.isLast = true;
        node.word = word;
    }

    public List<String> getWordsByPrefix(String word) {
        char[] cArr = word.toCharArray();
        TrieNode node = root;
        TrieNode tn = null;
        int index = 0;
        do {
            tn = node.child[cArr[index] - 'A'];
            if(tn == null) {
                return null;
            }
            index++;
            node = tn;
        }while (index < cArr.length);
        List<String> words = new ArrayList<>();
        Deque<TrieNode> DQ = new ArrayDeque<>();
        DQ.addLast(node);
        while (!DQ.isEmpty()) {
            TrieNode first = DQ.removeFirst();
            if(first.isLast) {
                words.add(first.word);
            }
            for(TrieNode n : first.child) {
                if(n != null) {
                    DQ.add(n);
                }
            }
        }
        return words;
    }
}
