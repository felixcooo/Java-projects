package app;

import java.util.Random;

public class PromptBank {

    private String[] questions;
    private String[] statements;
    private final int DEFAULT_SIZE = 6;

    Random rnd = new Random();

    public PromptBank() {
        questions = new String[DEFAULT_SIZE]; //questions array with a default size of index.
        statements = new String[DEFAULT_SIZE];//statements array with a default size of index.
     
    }

    //greeting method from Eliza.
    public String greeting(String name) {
        return "ELIZA: Hello, " + name + ". " + "Tell me what is on your mind today in 1 sentence.";
    }

    public void populateStatementsArray() {
        statements[0] = "ELIZA: Tell me more about BLANK1 and BLANK2.";
        statements[1] = "ELIZA: BLANK1 seems important to you, so does BLANK2. Please tell me more.";
        statements[2] = "ELIZA: BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
        statements[3] = "ELIZA: I'm listening. Tell me more about what's on your mind regarding BLANK1 and BLANK2.";
        statements[4] = "ELIZA: I'm curious to hear more about BLANK1 and BLANK2.";
        statements[5] = "ELIZA: You mentioned BLANK1 and BLANK2. I'm interested to know more about your perspective on them.";
    }

    public void populateQuestionsArray() {
        questions[0] = "ELIZA: Is there anything else about BLANK1 and BLANK2?";
        questions[1] = "ELIZA: Does BLANK1 bother you? How about BLANK2?";
        questions[2] = "ELIZA: Are BLANK1 and BLANK2 things you think about often?";
        questions[3] = "You mentioned BLANK1 and BLANK2 earlier. Are they something you'd like to discuss further?";
        questions[4] = "ELIZA: In what ways do BLANK1 and BLANK2 affect you?";
        questions[5] = "ELIZA: I'm intrigued by BLANK1 and BLANK2. Can you tell me why they're on your mind?";

    }

    //String method for random questions responses.
    public String getRandomQuestionTrunk(String word1) {
    	populateQuestionsArray();
    	int randomInt = (int)(Math.random() * DEFAULT_SIZE);
        return questions[randomInt];
    }

    //String method for random statements responses.
    public String getRandomStatementTrunk(String word2) {
    	populateStatementsArray();
    	int randomInt = (int)(Math.random() * DEFAULT_SIZE);
        return questions[randomInt];
    }
}