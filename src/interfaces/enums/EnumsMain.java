package interfaces.enums;

import java.util.Arrays;

public class EnumsMain {

    public static void main(String[] args) {

        Size s = Size.EXTRA_LARGE;

        Size s1 = Enum.valueOf(Size.class, "SMALL");

        Size [] values = Size.values();

        System.out.println(s.getAbbreviation());
        System.out.println(Arrays.toString(values));
        System.out.println(Size.EXTRA_LARGE.ordinal());

//        ==============================

        System.out.println(WeekDay.valueOf("MONDAY"));

        System.out.println(WeekDay.MONDAY);

        System.out.println(Arrays.toString(WeekDay.values()));

        WeekDay days = WeekDay.values()[7];

        switch (days) {
            case MONDAY:
            System.out.println();
        }


    }

}
