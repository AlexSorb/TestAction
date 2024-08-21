package org.example;

import org.example.model.Calculate;
import org.example.model.Message;

public class Main {
    public static void main(String[] args) {
        String message = "Hello GitHub Actions";
        Message.message(message);

        int a = 10;
        int b = 5;
        System.out.println(a + " + " + b + " = " + Calculate.sum(a, b));
    }
}