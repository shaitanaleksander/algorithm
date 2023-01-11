package org.leetcode.backtracking;

import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {

    @Test
    public void generateParenthesisTest() {


        GenerateParentheses generateParentheses = new GenerateParentheses();

        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = generateParentheses.generateParenthesis(3);
        System.out.println(result);

    }
}
