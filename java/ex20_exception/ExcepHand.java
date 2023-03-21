package ex20_exception;

public class ExcepHand {
    public static void main(String[] args) {
        //uncaught exception or unchecked exception
//        int i=10/0;
//        System.out.println(i);

        //caught exception or checked exception
//        Thread.sleep(1000);

        int a[] = {1,2,3,4,5};
        for (int j=0; j<6;j++){
            System.out.println(a[j]);
        }
        System.out.println("Printed all Numbers");

    }
}
