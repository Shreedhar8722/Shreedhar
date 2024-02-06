package com.tns.assign2_2;

import java.util.Scanner;

public class WordPresenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        SentenceChecker sentenceChecker = new SentenceChecker(sentence);

        System.out.println("Enter the word");
        String word = scanner.nextLine();

        if (sentenceChecker.checkWord(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}
