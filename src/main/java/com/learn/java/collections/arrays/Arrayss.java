package com.learn.java.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] pre = new int[n];
        int[] suf = new int[n];


        int p = 1;
        for(int i=0; i<n; i++){
            p *= nums[i];
            pre[i] = p;
        }

        p = 1;
        for(int i=n-1; i>=0; i--){
            p *= nums[i];
            suf[i] = p;
        }



        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            if( i > 0 && i < n-1 ){
                arr[i] = pre[i-1] * suf[i+1];
            }else if( i == 0 ){
                arr[i] = suf[i+1];
            }
            else if( i == n-1 ){
                arr[i] = pre[i-1];
            }
        }

        return arr;
    }
}

public class Arrayss {
}
