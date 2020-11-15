package com.leo.lab.solution.java.implementtrieprefixtree;

import com.leo.lab.question.ImplementTriePrefixTree;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * @author Leo Lu
 * @since 2020/06/14
 */
public class Solution implements ImplementTriePrefixTree {

    @Override
    public Trie getTrie() {
        return new TrieImpl();
    }

    private class TrieImpl extends Trie {

        private final Node root = new Node();

        TrieImpl() {

        }

        @Override
        public void insert(String word) {
            Node current = root;
            for (int i = 0; i < word.length(); i++) {
                Character c = word.charAt(i);
                Node child = current.contains(c);
                if (child == null) {
                    current = current.addChild(c);
                } else {
                    current = child;
                }
            }
            current.setIsWord(true);
        }

        @Override
        public boolean search(String word) {
            return searchPrefix(word, true);
        }

        @Override
        public boolean startsWith(String prefix) {
            return searchPrefix(prefix, false);
        }

        private boolean searchPrefix(String prefix, boolean isFullMatched) {
            Node current = root;
            for (int i = 0; i < prefix.length(); i++) {
                Character c = prefix.charAt(i);
                Node child = current.contains(c);
                if (child == null) {
                    return false;
                } else {
                    current = child;
                }
            }
            if (isFullMatched) {
                return current.isWord();
            } else {
                return true;
            }
        }

        private class Node {

            private ArrayList<Node> mChildList = new ArrayList<>();
            private Character mData;
            private boolean mIsWord;

            private void setData(Character data) {
                mData = data;
            }

            private Character getData() {
                return mData;
            }

            private boolean isWord() {
                return mIsWord;
            }

            private void setIsWord(boolean isWord) {
                mIsWord = isWord;
            }

            @NotNull
            private Node addChild(Character data) {
                Node node = new Node();
                node.setData(data);
                mChildList.add(node);
                return node;
            }

            @Nullable
            private Node contains(Character data) {
                for (Node child : mChildList) {
                    if (child.getData().equals(data)) {
                        return child;
                    }
                }
                return null;
            }
        }
    }
}
