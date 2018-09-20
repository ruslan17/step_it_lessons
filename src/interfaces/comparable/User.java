package interfaces.comparable;

import java.util.Arrays;

public class User implements Comparable {

    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        User u = (User) o;
        return Integer.compare(age, u.age);
//        return name.compareTo(u.name);
    }

    public static void main(String[] args) {

//        Сортировка массива юзеров
        User [] users = new User[3];

        users [0] = new User("John", 31);
        users [1] = new User("Ann", 18);
        users [2] = new User("Dan", 25);

        Arrays.sort(users);

        System.out.println(Arrays.toString(users));


//        Сортировка массива строк

        String[] strings = new String[] {"Bbc", "Ace"};

        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings));

    }
}
