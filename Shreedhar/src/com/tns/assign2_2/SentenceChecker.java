package com.tns.assign2_2;


class SentenceChecker {
    private String sentence;

    public SentenceChecker(String sentence) {
        this.sentence = sentence;
    }

    public boolean checkWord(String word) {
        return sentence.contains(word);
    }
}
