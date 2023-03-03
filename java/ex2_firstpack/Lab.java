package ex2_firstpack;

public class Lab {


    double scanner;   //must be in
    String computer;   //one string - value - MS Office installed
    int tables; // no. of tables
     char medicine;// one name - letter - one letter - use correct data type
    long result; // decimal variable long decimal use correct data type


    public static void main(String[] args) {

        // create an object

        Lab object= new Lab();

        object.computer= "Ms Office 2010";
        object.scanner= 2011.11;
        object.medicine= 'V';
        object.tables= 5;
        object.result= 24541454555412415L;


        System.out.println("Install scanner version: "+ (object.scanner));
        System.out.println("Install computer program: "+(object.computer));
        System.out.println("Set up number of table in office: "+ (object.tables));
        System.out.println("Check the Medication of patient: "+ (object.medicine));
        System.out.println("check the current version: "+ (object.result));






    }

}
