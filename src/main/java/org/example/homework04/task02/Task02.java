package org.example.homework04.task02;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */

import java.util.Stack;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(isValid("({{}}[])"));
    }

    public static boolean isValid(String s) {
        Stack<String> result = new Stack<>();
        String[] arrayChar = s.split("");
        for (String ch : arrayChar) {
            if (ch.equals("("))
                result.push(")");
            else if (ch.equals("{"))
                result.push("}");
            else if (ch.equals("[")) {
                result.push("]");
            } else if (result.isEmpty() || !result.pop().equals(ch)) {
                return false;
            }
        }
        return result.isEmpty();

    }
}
