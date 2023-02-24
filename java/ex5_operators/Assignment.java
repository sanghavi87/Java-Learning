package ex5_operators;

public class Assignment {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        int c;
        System.out.println(c=a+b); // 30
        System.out.println(c+=a);  // 40
        System.out.println(c-=a);  // 30
        System.out.println(c*=a);  //300
        System.out.println(c/=a);  // 30
        System.out.println(c%=a);  // 0
        int  d=2;
        System.out.println(a^=d);  //10

    }
}
