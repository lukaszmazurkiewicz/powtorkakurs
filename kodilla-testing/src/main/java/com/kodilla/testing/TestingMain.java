package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(10, 5);
        int subtractResult = calculator.subtract(10, 5);

        if (addResult == 15) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error");
        }

        if (subtractResult == 5) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
