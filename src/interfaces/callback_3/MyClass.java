package interfaces.callback_3;

public class MyClass implements SomeClass.Callback {

    @Override
    public void callingBack() {

        System.out.println("Вызов метода обратного вызова");

    }
}
