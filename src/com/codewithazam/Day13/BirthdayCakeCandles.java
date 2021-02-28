package com.codewithazam.Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3};

        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
            intList.add(i);
        }

        int count = birthdayCakeCandles(intList);
        System.out.println(count);

    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxValue = Integer.MIN_VALUE;
        for (int i=0; i<candles.size();i++){
            maxValue = Math.max(maxValue, candles.get(i));
        }

        int maxCount =0;
        for (int i =0; i <candles.size();i++){
            if   (candles.get(i) == maxValue){
                maxCount++;
            }
        }
       return maxCount;

    }
}
