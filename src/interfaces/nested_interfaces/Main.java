package interfaces.nested_interfaces;

public class Main {

    public static void main(String[] args) {

        NestedInterface.PublicNested nested = new NestedInterfaceImpl();

        nested.test();

        NestedInterface.ProtectedNested protectedNested = new NestedInterfaceChild();

        protectedNested.test1();

        NestedInterface nestedInterface = new NestedInterface();

        NestedInterface.PrivateNestedImpl privateNested = nestedInterface.new PrivateNestedImpl();

//        =============================================

        NestedClass.Nested nested1 = new NestedClass.Nested();

        nested1.setAnInt(5);
        System.out.println(nested1.getAnInt());

//        =============================================

    }

}
