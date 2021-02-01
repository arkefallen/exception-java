package Try;

// Creating new exception

class WillError extends Exception {
    public WillError() {}
    public WillError(String msg) {
        super(msg);
    }
}

public class Try11 {
    public static void main(String[] args)  throws WillError{
        WillError err = new WillError("Testing error");
        throw err;
    }
}
