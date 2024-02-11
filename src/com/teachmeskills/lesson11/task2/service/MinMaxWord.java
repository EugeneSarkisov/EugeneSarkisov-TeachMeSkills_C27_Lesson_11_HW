package com.teachmeskills.lesson11.task2.service;

/**
 * This class contain method "findMinMax" to search min and max -length words.
 */

public class MinMaxWord {
    public static void findMinMax(String strSample){
        String[] words = strSample.split(" ");
        String minMaxWord = words[0];
        for (String word : words) {
            if (word.length() <= minMaxWord.length()) {
                minMaxWord = word;
            }
        }
        System.out.println(minMaxWord);
        for(String word : words){
            if (minMaxWord.length() <= word.length()){
                minMaxWord = word;
            }
        }
        System.out.println(minMaxWord);
    }
}
