package com.tns.assign2_3;

class SentenceArranger {
    private String sentence;

    public SentenceArranger(String sentence) {
        this.sentence = sentence;
    }

    public String arrangeLetters() {
        // Remove non-alphabetic characters and convert to lowercase
        String cleanedSentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Check if the cleaned sentence is equal to the original sentence
        // If not, it means there were non-alphabetic characters in the input
        if (!cleanedSentence.equals(sentence.toLowerCase())) {
            return sentence + " is an invalid input";
        }

        // Split the cleaned sentence into words
        String[] words = cleanedSentence.split("\\s+");

        StringBuilder arrangedSentence = new StringBuilder();

        for (String word : words) {
            char[] letters = word.toCharArray();
            // Sort the letters in the word
            java.util.Arrays.sort(letters);
            arrangedSentence.append(letters).append(" ");
        }

        return arrangedSentence.toString().trim();
    }
}
