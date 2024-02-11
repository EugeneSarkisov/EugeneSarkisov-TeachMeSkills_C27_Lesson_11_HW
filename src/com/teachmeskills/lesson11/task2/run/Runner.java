package com.teachmeskills.lesson11.task2.run;

import com.teachmeskills.lesson11.task2.service.MinMaxWord;

public class Runner {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        MinMaxWord.findMinMax(str1);
    }
}
