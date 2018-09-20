package io.lectures;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("a","a","a","b","b","","d","d","d","1","2","2","2");
//
//        int same = 1;
//
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (Objects.equals(list.get(i), list.get(i + 1))) {
//                same++;
//                if (same >= 3) {
//                    System.out.println(list.get(i));
//                    same = 1;
//                }
//
//            }
//        }
        test();
    }

    public static void test() {
        List<String> list = Arrays.asList("a","b","c","b","b","","d","d","d","1","a","b","c");

        int sameCount = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 2; j < list.size() - 1; j++) {
                if (Objects.equals(list.get(i) + list.get(i + 1), list.get(j) + list.get(j + 1))) {

                    sameCount++;
                } else {
                    sameCount = 1;
                }

                if (sameCount >= 2) {
                    System.out.println(list.get(i));
                    System.out.println(list.get(i+1));
                    System.out.println(i);
                    System.out.println(i + 1);
                    System.out.println(j);
                    System.out.println(j + 1);
                    System.out.println("****");
                }

            }
        }
    }

}
