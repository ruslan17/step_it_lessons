package interfaces.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator {

    @Override
    public int compare(Object o, Object t1) {

        if (o.getClass() != String.class && t1.getClass() != String.class) throw new ClassCastException();
        String s1 = (String) o;
        String s2 = (String) t1;
        return s1.length() - s2.length();
    }

    public static void main(String[] args) throws InterruptedException {
        Comparator comparator = new LengthComparator();
        comparator.compare("AVCF", "afwdsdfs");
//        System.out.println(comparator.compare("AVCF", "afwdsdfs"));

        String[] friends = { "Peter", "Paul", "Mary" };

//        Arrays.sort(friends, comparator);
        Arrays.sort(friends, new LengthComparator());

        System.out.println(Arrays.toString(friends));

//        ============================================

        Integer[] array = {1, 7, 4};

        Arrays.sort(array, new LengthComparator());
        System.out.println(Arrays.toString(array));
    }
}
