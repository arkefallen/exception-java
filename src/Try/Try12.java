package Try;

class CounterException extends Exception {
    String complaint;
    public CounterException(String msg) {
        this.complaint = msg;
    }

    @Override
    public String
    toString() {
        return "Counter Exception : " + complaint;
    }
}

class Counter {
    int n = 0;
    public int zero() { return n = 0;}
    public int up() { return ++n; }
    public int down() throws CounterException {
        if ( n<=0 ) {
            throw new CounterException( n + " Count Down Failed. ");
        }
        return --n;
    }
}

public class Try12 {
    public static void main(String[] args) {
        Counter aCounter = new Counter();
        aCounter.zero();
        aCounter.up();

        try {
            aCounter.down();
        } catch ( CounterException ce ) {
            System.out.println( "" + ce );
        }

        try {
            aCounter.down();
        } catch ( CounterException ce ) {
            System.out.println("" + ce);
        } finally {
            System.out.println("Finally");
        }
    }
}
