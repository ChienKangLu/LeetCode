package com.leo.lab.solution.java.implementtrieprefixtree;

import com.leo.lab.question.ImplementTriePrefixTree;
import com.leo.lab.solution.java.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Leo Lu
 * @since 2020/06/14
 */
public abstract class BaseImplementTriePrefixTreeTest extends BaseTest<ImplementTriePrefixTree> {

    @Test
    public void testInsertAndSearchIncludedWord() {
        // GIVEN
        String word= "search";

        // WHEN
        ImplementTriePrefixTree.Trie trie = tested.getTrie();
        trie.insert(word);

        // THEN
        Assert.assertTrue(trie.search(word));
    }

    @Test
    public void testInsertAndSearchExcludedWord() {
        // GIVEN
        String word= "search";

        // WHEN
        ImplementTriePrefixTree.Trie trie = tested.getTrie();
        trie.insert(word);

        // THEN
        Assert.assertFalse(trie.search("Sea"));
    }

    @Test
    public void testStartsWithWithinOneWord() {
        // GIVEN
        String word = "search";
        String prefix = "sea";

        // WHEN
        ImplementTriePrefixTree.Trie trie = tested.getTrie();
        trie.insert(word);

        // THEN
        Assert.assertTrue(trie.startsWith(prefix));
    }

    @Test
    public void testStartsWithWithinTwoWords() {
        // GIVEN
        String word = "manufacture";
        String word2 = "manual";
        String prefix = "man";

        // WHEN
        ImplementTriePrefixTree.Trie trie = tested.getTrie();
        trie.insert(word);
        trie.insert(word2);

        // THEN
        Assert.assertTrue(trie.startsWith(prefix));
    }

    @Test
    public void test() {
        // GIVEN
        String apple = "apple";
        String app = "app";

        // WHEN
        ImplementTriePrefixTree.Trie trie = tested.getTrie();
        trie.insert(apple);
        Assert.assertTrue(trie.search(apple));
        Assert.assertFalse(trie.search(app));
        Assert.assertTrue(trie.startsWith(app));
        trie.insert(app);
        Assert.assertTrue(trie.search(app));
    }
}
