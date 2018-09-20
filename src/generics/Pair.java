package generics;

public class Pair<T> {

    private T first;

    private T second;

    public static void print1(Pair<Employee> pair) {
        System.out.println(pair);
    }

    /**
     * ? extends Employee getFirst()
     * void setFirst(? extends Employee)
     * <p>
     * Это делает невозможным вызов метода setFirst (). Компилятору требуется
     * какой-нибудь подтип Employee, но неизвестно, какой именно. Он отказывается передать
     * любой конкретный тип, поскольку знак подстановки ? может и не совпасть
     * с этим типом. При вызове метода getFirst () такое затруднение не возникает. Значение,
     * возвращаемое методом getFirst (), вполне допустимо присвоить переменной
     * ссылки на объект типа Employee. В этом, собственно, и состоит главный смысл ограниченных
     * подстановок. С их помощью можно теперь отличать безопасные методы
     * доступа от небезопасных модифицирующих методов.
     */
    public static void print2(Pair<? extends Employee> pair) {

//        Manager manager = new Manager();

//        pair.setFirst(manager);
        System.out.println(pair);
    }

    public static void print4(Pair<? super Manager> pair) {
        Manager manager = new Manager();

        pair.setFirst(manager);
        System.out.println(pair);
    }

    /**
     * Тоже самое что и №2
     * @param pair
     * @param <R>
     */
    public static <R extends Employee> void print3(Pair<R> pair) {
        System.out.println(pair);
    }

    /**
     * Содержит ли пара пустые ссылки
     * @param pair
     * @return
     */
    public static boolean hasNulls(Pair<?> pair) {
        return pair.getFirst() == null || pair.getSecond() == null;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

}
