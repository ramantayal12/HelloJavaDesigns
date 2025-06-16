package com.learn.java.collections.maps;

import java.util.HashMap;
import java.util.TreeMap;

class StockPrice {
    HashMap<Integer, Integer> mp = new HashMap<>();
    TreeMap<Integer, Integer> mm = new TreeMap<>();
    int time = 0;
    public StockPrice() {
    }

    public void update(int timestamp, int price) {
        if( time <= timestamp ){
            time = timestamp;
        }

        if( mp.containsKey(timestamp) ){
            int freq = mm.get(mp.get(timestamp));
            if( freq == 1 ){
                mm.remove(mp.get(timestamp));
            }
        }
        mp.put(timestamp, price);
        int f = 0;
        if( mm.containsKey(price)){
            f = mm.get(price);
        }
        mm.put(price, f+1);
    }

    public int current() {
        return mp.get(time);
    }

    public int maximum() {
        return mm.lastKey();
    }

    public int minimum() {
        return mm.firstKey();
    }
}
/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */


public class Maps {
}
