package Try;

// Understanding exception mechanism

public class Try9 {
    public static void main(String[] args) {
        func1();
    }

    static void func1() {
        System.out.println(1);
        try {
            System.out.println(2);
            func2();
            // Number 3 will not be printed because
            // when there is an exception, the code after
            // the place of exception will not be run
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    static void func2() throws Exception {
        if ( true ) {
            throw new Exception();
        }
    }
}
