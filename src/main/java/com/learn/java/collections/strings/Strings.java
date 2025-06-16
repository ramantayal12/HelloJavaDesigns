package com.learn.java.collections.strings;


import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {

        ArrayList<String> arr = new ArrayList<>();

        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if( s.charAt(i) == ' '){
                if( str.length() > 0 ) arr.add(str.toString());
                str = new StringBuilder();
            }
            else{
                str.append(s.charAt(i));
            }
        }

        if( str.length() > 0 ) arr.add(str.toString());

        Collections.reverse(arr);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<arr.size(); i++){
            stringBuilder.append(arr.get(i));
            if( i != arr.size()-1) stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }
}

public class Strings {
}
