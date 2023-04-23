package com.epam.rd.autotasks.validations;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null || color.isEmpty() || color.isBlank())
            return false;
        String expression = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(color);
        return matcher.matches();
    }

    public static void main(String args[]) {
        String first = "123456";
        String second = "#afafah";
        String third = "#afafa";
        String fourth = "#afafag";
        String fifth = "#afzfax";
        String sixth = "#123abce";
        String seventh = "#123abce";
        String eighth = "#1234";
        String ninth = "#-123";
        String tenth = "#000000";
        String eleventh = "#999999";
        String twelve = "#1a1a1a";
        String thirteenth = "#1A1A1A";
        String fourteenth = "#0f0f0f";
        String fifteenth = " ";
        String sixteenth = "#0F0F0F";
        String seventeenth = "bcbcbf";
        String eigthteenth = "#BcbCbC";
        String ninteenth = "#000";
        String twentieth = "#FFF";
        String twentyOneth = "#abc";
        for (String s : Arrays.asList(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelve, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eigthteenth, ninteenth, twentieth, twentyOneth)) {
            System.out.println(validateColorCode(s));
        }
    }
}




