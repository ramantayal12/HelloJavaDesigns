package com.learn.java;

import java.util.HashMap;

class Solution {
    public int specialTriplets(int[] nums) {

        long mod = 1000000009;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        long cnt = 0;
        long zr = mp.get(0);
        if( zr >= 3 ){
            cnt += (zr * (zr-1) * (zr-2) )/3;
            cnt = cnt %mod;
        }

        for(int i: mp.keySet()){
            if( i == 0 ) continue;
            else{
                if( mp.containsKey(i*2) && mp.containsKey(i*4)){
                    cnt = (cnt + 1)%mod;
                }
            }
        }

        return Math.toIntExact(cnt);
    }
}
public class Test{

    public static void main(String[] args){
        Solution sol = new Solution();
//        sol.generateTag("Leetcode daily streak achieved");
    }
}