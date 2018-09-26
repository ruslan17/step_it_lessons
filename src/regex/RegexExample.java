package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    /**
     * [ Jj ] ava. +
     * • начинается с буквы J или j;
     * • содержит ava на месте трех последующих букв;
     * • а в остальной части содержит один или несколько произвольных символов.
     *
     * ]\^- специальные символы внури квадратных скобок которые нужно экранировать
     * ^ все символы кроме указанных
     */
    public static void main(String[] args) {

        final boolean step = test("Step ex");
        System.out.println(step);
//
//        final String test2 = test2("My number is 050 777 77 77");
//        System.out.println(test2);
//
//        final boolean kek = test4("ke");
//        System.out.println(kek);
//
//        test5("abcd");

//        emailRegex();

    }

    public static boolean test5(String testString){
        Pattern p = Pattern.compile("[a-c]");
        Matcher m = p.matcher(testString);
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
        return m.matches();
    }

    public static boolean test4(String testString){
        Pattern p = Pattern.compile("^[a-z]+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static String test2(String input) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(input);
        String output = matcher.replaceAll("#");
        return output;
    }

    public static boolean test(String testString){
        Pattern p = Pattern.compile("^Step$");
        Matcher m = p.matcher(testString);
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
        return m.matches();
    }

    public static boolean test3(String testString) {
        Pattern p = Pattern.compile(".+\\.(com|ua|ru)");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void emailRegex() {
        String text = "example+%-._@fmail.com";
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
        final boolean matches = text.matches(regex);
        System.out.println(matches);
    }

    public static boolean test6(String testString) {
        Pattern p = Pattern.compile("gr[ae]y");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void test7() {
//        bog;
//        dog;
//        kog;
//        [^k]og
    }


}
