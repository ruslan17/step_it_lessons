package interfaces.nested_interfaces;

public class NestedInterfaceChild implements NestedInterface.ProtectedNested {

    @Override
    public void test1() {
        System.out.println("Protected nested interface impl");
    }
}
