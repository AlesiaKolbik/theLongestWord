package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input="Это простое предложение.";
        int wordLength=0;
        int max=0;
        for(int i=0; i<input.length();i++) {
            if(input.charAt(i)!=' '&&input.charAt(i)!='.') {
                wordLength++;
            }
            else{
                max=Math.max(wordLength,max);
                wordLength=0;
            }
        }
        System.out.println("Самое длинное слово в этом предложении состоит из "+max+" букв.");
    }
}
