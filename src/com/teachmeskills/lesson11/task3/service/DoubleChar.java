package com.teachmeskills.lesson11.task3.service;

/**
 * This class contain method "charDouble" for doubling letters in string objects.
 */

public class DoubleChar {
    public static void charDouble(String strSample){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strSample.length(); i++){
            if(strSample.charAt(i) != ' ') {
                sb.append(strSample.charAt(i)).append(strSample.charAt(i));
            } else{
                sb.append(' ');
            }
        }
        System.out.println(sb);
    }
}
