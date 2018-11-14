package info.thecodinglive.exception;

public class ThrowsException {
    int division(int a, int b) throws ArithmeticException {
        int t = a/b;
        return t;
    }

    public static void main(String[] args) {
        ThrowsException obj = new ThrowsException();
        try {
            System.out.println(obj.division(15, 0));
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
