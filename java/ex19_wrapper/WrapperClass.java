package ex19_wrapper;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {
//      P to W
        int a=10;

        Integer aa = new Integer(a); //Boxing Wrapper Class
//           Or
        Integer bb = a; //Auto boxing

//      W to P
        int b =bb.intValue();//Unboxing
//          Or
        int c=bb; //Auto unboxing

//  Use a wrapper class

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(5);




    }
}
