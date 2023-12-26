// Creating our own exception type
class MyException1 extends Exception {
    private int detail;

    MyException1(int a) {
        super("MyException[" + a + "]");
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

class ExceptionDemo1 {
    static void compute(int a) throws MyException1 {
        System.out.println("called compute(" + a + ")");
        if (a>10)
            throw new MyException1(a);
        System.out.println("normal exit");
    }

    public static void main(String args[]) {
        try {
            compute(10);
            compute(20);
        } catch (MyException1 e) {
            System.out.println("caught" + e);
        }
    }
}
