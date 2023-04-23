package com.epam.rd.autotasks.words;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if (sample != null  && words != null) {
            sample = sample.strip();
            int count = 0;
            for (String word: words) {
                if (word.trim().equalsIgnoreCase(sample)) {
                    count += 1;
                }
            }
            return count;
        } else {
            return 0;
        }

    }

    public static String[] splitWords(String text) {
        if (text != null && !text.equals("")) {
            Pattern p1 = Pattern.compile("\\W*");
            Matcher m1 = p1.matcher(text);
            if (!m1.matches()) {
                Pattern p2 = Pattern.compile("\\A\\W*");
                Matcher m2 = p2.matcher(text);
                text = m2.replaceFirst("");
                String[] result = text.split("\\W+");
                if (result.length > 0) {
                    return result;
                }
            }
        }
        return null;
    }

    public static String convertPath(String path, boolean toWin) {
        if (path == null || path.equals("")) {
            return null;
        }
        if (path.lastIndexOf('~') > 0) {
            return null;
        }
        if (path.lastIndexOf("C:") > 1) {
            return null;
        }
        if ((path.indexOf('\\') != -1) && path.indexOf('~') != -1) {
            return null;
        }
        if ((path.indexOf('\\') != -1) && path.indexOf('/') != -1) {
            return null;
        }
        if ((path.indexOf("C:") != -1) && path.indexOf('/') != -1) {
            return null;
        }
        if ((path.indexOf("C:") != -1) && path.indexOf('~') != -1) {
            return null;
        }

        if (path.lastIndexOf("C:") > 1) {
            return null;
        }
        if ((path.indexOf("[//+]") != -1)) {
            return null;
        }
        if (toWin) {
            int i = path.lastIndexOf('~');
            int i1 = path.lastIndexOf('\\');
            int i2 = path.lastIndexOf("C:");

            if (i < 1 && i1 == -1 && i2 == -1) {
                if (path.charAt(0) == '~' && path.length() != 1) {
                    path = path.replaceFirst("~/", "C:\\\\User\\\\");

                } else if (path.charAt(0) == '~' && path.length() == 1) {
                    path = path.replaceFirst("~", "C:\\\\User");
                } else if (path.charAt(0) == '/') {
                    path = path.replaceFirst("/", "C:\\\\");
                }
                path = path.replaceAll("/", "\\\\");

                return path;
            }
        } else {
            int i = path.lastIndexOf('C');
            int i1 = path.lastIndexOf('/');
            int i2 = path.lastIndexOf("~");
            if (i < 1 && i1 == -1 && i2 == -1) {
                if (path.indexOf("C:\\User") != -1) {
                    path = path.replaceFirst("C:\\\\User", "~");
                } else if (path.charAt(0) == 'C') {
                    path = path.replaceFirst("C:\\\\", "/");
                } else if (path.charAt(0) == '/') {
                    path = path.replaceFirst("/", "C:\\\\");
                } else {
                }
                path = path.replaceAll("\\\\", "/");

                return path;
            }
        }
        return path;
    }


    public static String joinWords(String[] words) {
        boolean notEmpty = false;
        if (words != null && words.length > 0) {
            StringJoiner joiner = new StringJoiner(", ", "[", "]");
            for (String word: words) {
                if (!word.equals("")){
                    notEmpty = true;
                    joiner.add(word);
                }
            }
            if (notEmpty) {
                return joiner.toString();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}