package com.tns.assign2_3;

import java.util.Scanner;

public class WordArranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        SentenceArranger sentenceArranger = new SentenceArranger(sentence);

        String arrangedSentence = sentenceArranger.arrangeLetters();

        System.out.println(arrangedSentence);
    }
}
