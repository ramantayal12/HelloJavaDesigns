package com.learn.java.collections.stacks;

import java.util.Stack;

class Pair{
    int a, b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

}

class StockSpanner {
    Stack<Pair> st = new Stack<>();
    int cnt = 0;

    public StockSpanner() {

    }

    public int next(int price) {
        while( st.size() > 0 && st.peek().a <= price ){
            st.pop();
        }

        if( st.size() == 0 ){
            return 1;
        }
        int ans = cnt - st.peek().b + 1;

        st.push(new Pair(price, cnt));
        cnt++;

        return ans;
    }
}