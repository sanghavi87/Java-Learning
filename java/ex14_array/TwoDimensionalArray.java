package ex14_array;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int a[][] =new int[4][4];

        a[0][0] = 5;
        a[0][1] =10;
        a[0][2] =15;
        a[0][3] =20;

        a[1][0]=25;
        a[1][1]=30;
        a[1][2]=35;
        a[1][3]=40;

        a[2][0]=45;
        a[2][1]=50;
        a[2][2]=55;
        a[2][3]=60;

        a[3][0]=65;
        a[3][1]=70;
        a[3][2]=75;
        a[3][3]=80;


        for(int r=0;r<a.length;r++){
            for(int c=0;c<a.length;c++){
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }

    }
}
