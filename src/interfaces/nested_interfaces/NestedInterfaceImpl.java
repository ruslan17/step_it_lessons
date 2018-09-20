package interfaces.nested_interfaces;

public class NestedInterfaceImpl implements NestedInterface.PublicNested {
    @Override
    public void test() {
        System.out.println("Impl of nested interface");
    }
}
