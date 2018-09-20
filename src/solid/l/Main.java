package solid.l;


/**
 * L

 Принцип подстановки Барбары Лисков (The Liskov Substitution Principle)
 «объекты в программе должны быть заменяемыми на экземпляры их подтипов без изменения правильности выполнения программы.» См. также контрактное программирование.
 Наследующий класс должен дополнять, а не изменять базовый.

 */
public class Main {



}

class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int getArea() {
        return width*height;
    }
}

class Square extends Rectangle {

    int getArea() {
        Square square = new Square();
        return square.getHeight()*square.getHeight();
    }


}