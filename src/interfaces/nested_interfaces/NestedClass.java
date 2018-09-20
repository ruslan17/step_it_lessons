package interfaces.nested_interfaces;

public interface NestedClass {

    class Nested {
        private int anInt;

        public int getAnInt() {
            return anInt;
        }

        public void setAnInt(int anInt) {
            this.anInt = anInt;
        }

        static void aVoid() {
            System.out.println("aaaaaa");
        }
    }

}
