package info.thecodinglive.exception;

public class ThrowExample {
    void validAge(int age) {
        if(age < 19) {
            throw new ArithmeticException("소주를 구매할 수 없습니다.");
        } else {
            System.out.println("소주를 구매할 수 있습니다.");
        }
    }

    public static void main(String[] args) {
        ThrowExample obj = new ThrowExample();
        obj.validAge(13);
        System.out.println("end");
    }
}
