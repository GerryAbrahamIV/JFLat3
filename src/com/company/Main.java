package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] sd = {"12345", "67845"};
        String sd1 = sd[0];
        String sd2 = sd[1];
        char[] ca1 = sd1.toCharArray();
        char[] ca2 = sd2.toCharArray();
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < ca1.length;i++){
            if (ca1[i] != ca2[i]) {
                result.append(i).append(",");
                count++;
            }
        }
        result.delete(result.length() - 1, result.length());

        System.out.println("total character tidak sama adalah "+count+". yaitu index " + result.toString());
    }
}
