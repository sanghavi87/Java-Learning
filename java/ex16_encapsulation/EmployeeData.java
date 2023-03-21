package ex16_encapsulation;

public class EmployeeData {
//    2
    public int Id;
    public String name;
    private int Salary;

//    3
//    public void getEmpName(){
//        System.out.println("Employee Name");
//    }
//    public void getEmpBonus(){
//        System.out.println("Employee Bonus");
//    }
//    4
//    EmployeeData(){
//        Id=10;
//        name = "Tester2";
//        Salary = 20000;
//    }

//    1
//    public static void main(String[] args) {
////        Simple Variable Access
//        EmployeeData EmpData = new EmployeeData();
////        EmpData.Id =001;
////        EmpData.name = "Tester";
////        EmpData.Salary = 30000;
////
////        System.out.println("Employee Id is:"+EmpData.Id+"\n"+"Employee Name is:"+EmpData.name+"\n"+"Employee Salary is:"+EmpData.Salary);
//
////        Method Access
////      EmpData.getEmpName();
////      EmpData.getEmpBonus();
//
////      Constructor Access
//        System.out.println(EmpData.Id);
//        System.out.println(EmpData.name);
//        System.out.println(EmpData.Salary);
//
//    }

//    6. Getter and Setter Method.
    public void setSalary(int Salary){//this: When you want to give local variable to class variable
        this.Salary = Salary;

    }
    public int getSalary(){
        return Salary;
    }

}
