package generics.constraints_and_warns;

import generics.generic_type_constraints.task.Pair;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("unchecked")
public class Main {

//    Преодолеваем ограничение на создание массива обобщенного типа в параметрах - "T... ts"
    @SafeVarargs
    public static <T> void addAll(Collection<T> coll, T... ts) {
        for (T t : ts) {
            coll.add(t);
        }
    }

    public static void main(String[] args) {
        Collection<Pair<String>> table = new ArrayList<>();

        Pair<String> pair1 = new Pair<>();
        Pair<String> pair2 = new Pair<>();
        addAll(table, pair1, pair2);
        System.out.println();
    }


}
