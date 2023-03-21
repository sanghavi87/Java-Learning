package ex14_array;

public class ArrayConcept {



    public static void main(String[] args) {

//        Int Array

//        int a[] = new int[5];
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;
//        a[3]=40;
//        a[4]=50;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);

//        System.out.println("a="+a[0]);

//        System.out.print("A="+a[0] +"\n" + "A="+a[1]+"\n"+"A="+a[2]+"\n"+"A="+a[3]+"\n"+"A="+a[4]);
//        System.out.println(Arrays.toString(a));

//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);

//        for(int i=0;i<=4;i++){
//            System.out.println("A="+a[i]);
//        }


//        String Array

//        String []name = new String[4];
//        name[0]="Test1";
//        name[1]="Test2";
//        name[2]="Test3";
//        name[3]="Test4";
//
//        for(int i=0;i<name.length;i++){
//            System.out.println("NAME="+name[i]);
//        }
//
//        System.out.println(name.length); //Checking the array length

//        Object Array


        Object StudD[] = new Object[10];
        StudD[0]= 1;
        StudD[1]= "Tester Test";
        StudD[2]= 'M';
        StudD[3]= 85.87f;
        StudD[4]= true;
        StudD[5]= 123456789L;
        StudD[6]= 'M';
        StudD[7]= 85.87f;
        StudD[8]= true;
        StudD[9]= 123456789L;

        for(int i=0;i<StudD.length;i++){
            System.out.println("Student Data="+StudD[i]);
        }









    }

}
