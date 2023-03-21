package ex20_exception;

public class ThrowsKeyword {

    public void sum(){
        try{
            div();
        }catch (ArithmeticException e){

        }

    }

    public void div()throws ArithmeticException{
        int i=10/0;
    }

    public static void main(String[] args)  throws ArithmeticException{
       ThrowsKeyword throwsKeyword = new ThrowsKeyword();
       throwsKeyword.sum();

        System.out.println("Exception Handled");
    }
}
