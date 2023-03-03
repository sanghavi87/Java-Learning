package ex13_constructor;

public class Constructor {
    int i=10; //Class attributes


    Constructor(){
        i=5; //Set the initial value of attributes

        i=20;
    }



    public static void main(String[] args) {

        Constructor OBJ1 = new Constructor();
        System.out.println(OBJ1.i);

    }
}
