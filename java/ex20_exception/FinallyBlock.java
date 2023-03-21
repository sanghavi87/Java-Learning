package ex20_exception;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int n[] = {100, 200, 300};
            System.out.println(n[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of size");
        }catch (Exception e){
            System.out.println("Any other Exception");
        }finally {
            System.out.println("100% working");
        }
    }
}
