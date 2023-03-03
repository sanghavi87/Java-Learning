package ex2_firstpack;

public class Constructor {

    int i; //class attributes

   Constructor()
   {
       i=5;  // set the initial value of attributes
       i=20;

   }


    public static void main(String[] args) {

       Constructor object = new Constructor();
        System.out.println(object.i);



    }
}
