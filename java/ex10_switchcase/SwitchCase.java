package ex10_switchcase;

public class SwitchCase {
    public static void main(String[] args) {
        int s=5;
        switch (s){
            case 1:
                System.out.println("Fan");
                break;
            case 2:
                System.out.println("Light");
                break;
            case 3:
                System.out.println("TV");
                break;
            case 4:
                System.out.println("Lamp");
                break;
            default:
                System.out.println("Not Applicable");
        }
    }
}
