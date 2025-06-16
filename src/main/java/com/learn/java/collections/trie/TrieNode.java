package com.learn.java.collections.trie;

import java.util.HashMap;

class Node{
    boolean isTerminal = false;
    HashMap<Character, Node> child = new HashMap<>();

    public static void insert(Node root, String word){

        for(int i=0; i<word.length(); i++){
            if( !root.child.containsKey(word.charAt(i))){
                root.child.put(word.charAt(i), new Node());
            }
            root = root.child.get(word.charAt(i));
        }
        root.isTerminal = true;

    }

    public static boolean search(Node root, String word){
        for(int i=0; i<word.length(); i++){
            if( !root.child.containsKey(word.charAt(i))){
                return false;
            }
            root = root.child.get(word.charAt(i));
        }
        return root.isTerminal;
    }

    public static boolean startsWith(Node root, String word){
        for(int i=0; i<word.length(); i++){
            if( !root.child.containsKey(word.charAt(i))){
                return false;
            }
            root = root.child.get(word.charAt(i));
        }
        return true;
    }
}

class Trie {

    Node nod = new Node();
    public Trie() {

    }

    public void insert(String word) {
        Node root = nod;
        Node.insert(root, word);
    }

    public boolean search(String word) {
        Node root = nod;
        return Node.search(root, word);
    }

    public boolean startsWith(String prefix) {
        Node root = nod;
        return Node.startsWith(root, prefix);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

public class TrieNode {
}
