package collections;


import collections.queue.User;

import java.util.*;

public class Test {

    public static void test() {
        User user1 = new User(1, "John");
        User user2 = new User(2, "John");
        User user3 = new User(3, "John");

        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);

        Map<Integer, User> map = new HashMap<>();

        for (User user: users) {
            map.put(user.getId(), user);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
      test2();

    }

    public static void testUsers() {

    }

    public static void test2() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.next());
        }

//        while (scanner.hasNext()) {
//
//            String s = scanner.next();
//            list.add(s);
//            if (Objects.equals(s, "404")) {
//                break;
//            }
//        }

        System.out.println(list);
    }

}
