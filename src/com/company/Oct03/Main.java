package com.company.Oct03;

import com.company.palindrom.ValidPalindrome;

public class Main {
    public static void main(String[] args) {
        KDiffPairsInAnArray pairsInAnArray = new KDiffPairsInAnArray();
        System.out.println("Number of pairs :"+pairsInAnArray.findPairs(new int[]{2,5,4,3,5,6}, 3));
    }
}
