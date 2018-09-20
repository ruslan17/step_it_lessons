package collections.game;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Game {


    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    private static final Map<Integer, User> users = new HashMap<>();


    private static final Map<Integer, Product> products = new HashMap<>();

    private static final Map<Integer, Product> productsInCart = new HashMap<>();

    private static final User user = new User(1, "John", "johny", "password");
    private static final Product apple = new Product(1, "Apple");
    private static final Product bread = new Product(2, "Bread");
    private static final Product juice = new Product(3, "Juice");

    static {
        users.put(user.getId(), user);

        products.put(apple.getId(), apple);
        products.put(bread.getId(), bread);
        products.put(juice.getId(), juice);
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        String login;
        String password;
        System.out.println("Введите login:");
        login = scanner.next();

        System.out.println("Введите пароль:");
        password = scanner.next();

        boolean check = checkUser(login, password);

        if (check) {
            User user = getUser(login);

            if (user != null) {
                menu();
//                System.out.println(user);
            }
        } else {
            System.out.println("Такого юзера нет.");
            System.out.println("1. Попробовать ещё раз       2. Зарегистрироваться");
            int n = scanner.nextInt();
            if (n == 1) {
                login();
            } else if (n == 2){
                register();
            }
        }
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        String name;
        String login;
        String password;

        System.out.println("Введите имя:");
        name = scanner.next();

        System.out.println("Введите login:");
        login = scanner.next();

        System.out.println("Введите пароль:");
        password = scanner.next();

        User user = getUser(login);
        if (user.getLogin() != null) {
            System.out.println("Юзер с таким логином уже существует");
            System.out.println("1. Попробовать ещё раз            2.Выйти");
            int n = scanner.nextInt();
            if (n == 1) {
                register();
            }
        } else {
            saveUser(name, login, password);
            User user1 = getUser(login);
            menu();
//            System.out.println(user1);
        }
    }

    public static void menu() {
        System.out.println("1. Продукты      2. Корзина      3. Выйти");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            getProducts();
            saveToCart();
            menu();
        } else if (choice == 2) {
            getCart();
        }
    }

    private static void saveToCart() {

        Scanner scanner = new Scanner(System.in);

        String added = scanner.next();

        List<Integer> addedList = Pattern.compile(",")
                .splitAsStream(added)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        products.forEach((k, v) -> addedList.forEach(product -> {
            if (k.equals(product)) {
                productsInCart.put(k, v);
            }
        }));

    }

    private static void getCart() {
        System.out.println("КОРЗИНА");
        productsInCart.forEach((integer, product) -> System.out.println(integer + " " + product));
        System.out.println("Оплатить");
    }

    public static void getProducts() {
        System.out.println("ПРОДУКТЫ");
        products.forEach((integer, product) -> System.out.println(integer + " " + product));
    }

    public static void saveUser(String name, String login, String password) {

        int maxId = getMaxId() + 1;

        User user = new User(maxId, name, login, password);

        users.put(maxId, user);
//        System.out.println(users);

    }

    public static int getMaxId() {
        Set<Integer> ids = users.keySet();

        return Collections.max(ids);
    }

    private static void enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Зайти                 2.Зарегистрироваться");
        int input = scanner.nextInt();

        if (input == 1) {
            login();

        } else if (input == 2) {
            register();
        }

    }

    public static void main(String[] args) {
        enter();

//        saveToCart();

        System.out.println(productsInCart);
    }

    private static User getUser(String login) {

        User user1 = new User();

        for (Map.Entry<Integer, User> user: users.entrySet()) {
            if (Objects.equals(user.getValue().getLogin(), login)) {
                user1 = user.getValue();
            }
        }

        return user1;

    }

    private static boolean checkUser(String login, String password) {

        for (Map.Entry<Integer, User> user: users.entrySet()) {
            if (Objects.equals(user.getValue().getLogin(), login) && user.getValue().getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
