package com.leo.lab.question;

/**
 * @author Leo Lu
 * @since 2020/06/14
 */
public interface ImplementTriePrefixTree extends Question {

    /**
     * The name comes from the word retrieval, which indicates that this
     * structure is designed for search and retrieval operations, specifically
     * searching for things that match a prefix string.
     */
    abstract class Trie {

        /** Initialize your data structure here. */
        public Trie() {

        }

        /** Inserts a word into the trie. */
        abstract public void insert(String word);

        /** Returns if the word is in the trie. */
        abstract public boolean search(String word);

        /** Returns if there is any word in the trie that starts with the given prefix. */
        abstract public boolean startsWith(String prefix);
    }

    Trie getTrie();
}
