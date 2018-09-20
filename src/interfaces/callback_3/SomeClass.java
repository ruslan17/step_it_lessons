package interfaces.callback_3;

import javax.swing.*;

public class SomeClass {

    interface Callback{
        void callingBack();
    }

    Callback callback;

    public void registerCallBack(Callback callback){
        this.callback = callback;
    }

    void doSomething(){
        JOptionPane.showMessageDialog(null, "Выполняется работа");

        // вызываем метод обратного вызова
        callback.callingBack();
    }

}
