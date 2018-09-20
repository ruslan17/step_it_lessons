package generics.checked_to_uchecked;

public abstract class Block  {

    public abstract void body() throws Exception;

//    public Thread toThread() {
//        return new Thread() {
//            public void run() {
//                try {
//                    body();
//                } catch (Throwable t) {
//                    Block.<RuntimeException>throwAs(t);
//                }
//            }
//        };
//    }

    public Thread toThread() {
        return new Thread(() -> {
            try {
                body();
            } catch (Throwable t) {
                Block.throwAs(t);
            }
        });
    }

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;
    }

}
