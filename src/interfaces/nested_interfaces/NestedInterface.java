package interfaces.nested_interfaces;

public class NestedInterface {

    public interface PublicNested {
        void test();
    }

    protected interface ProtectedNested {
        void test1();
    }

    private interface PrivateNested {
        void test1();
    }

    public class PrivateNestedImpl implements PrivateNested {

        @Override
        public void test1() {
            System.out.println("Private nested interface impl");
        }
    }

}
