package ex12_methods;

public class MethodOverloading {

//    static int myMethod(int x, int y){
//            return x+y;
//    }
//
//    static double myMethod(double x, double y){
//            return x+y;
//    }
//
//    public static void main(String[] args) {
////        int total = myMethod(12,20);
////        System.out.println(total);
////        double result = myMethod(2.5,6.5);
////        System.out.println(result);
//
//        System.out.println(myMethod(20,30));
//        System.out.println(myMethod(2.4,4.6));
//}
        static  void myMethod(int x, int y) {
            System.out.println(x+y);
        }
        static  void myMethod(double x, double y) {
            System.out.println(x+y);
        }

        public static void main(String[] args) {
            myMethod(10,20);
            myMethod(5.5,4.6);

        }

}
