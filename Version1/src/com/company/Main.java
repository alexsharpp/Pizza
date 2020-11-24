package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String q1 = "what is the colour of a bannana\n"
                + "(A) y\n (B)...\n(C)...\n(D)...";
        String q2 = "what is....\n"
                + "(A) ...\n (B)...\n(C)...\n(D)...";
        String q3 = "what is monkey\n"
                + "(A) .animal..\n (B)...\n(C)...\n(D)...";
        String q4 = "what is hair\n"
                + "(A) .blonde\n (B)...\n(C)...\n(D)...";

        Question [] questions = {
                new Question (q1, "a"),
                new Question (q1, "a")
        };
        takeTest(questions);
    }

    public static void takeTest(Question[] questions){
        int score = 0;
        Scanner keyboardinput = new Scanner(System.in);
        for(int x = 0;x< questions.length;x++){
            System.out.println(questions[x].prompt);
            String answer = keyboardinput.nextLine();
            if (answer.equals(questions[x].answer)){
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);

    }
}
