package ex20_exception;

public class TryCatch {
    public static void main(String[] args) {
        try{
        int a[] = {1,2,3,4,5};
        for (int j=0; j<6;j++){
            System.out.println(a[j]);
        }}catch(Exception e){
            System.out.println("Array size is not right");
        }

        System.out.println("Printed all Numbers");
    }
}
