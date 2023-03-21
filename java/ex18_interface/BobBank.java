package ex18_interface;
/*
- We can not have a method body - only method declarations- 100% Abstraction.
- It will define all method in interface with no implementations
- No static methods in interface because we cannot override static.
- We can not create object of interface
-
 */
public class BobBank implements UK,USA,AUS {


    @Override
    public void freeDebitCard() {
        System.out.println("Free Debit Card");
    }

    @Override
    public void freeSavingAct() {
        System.out.println("Free Saving Account");
    }

    @Override
    public void freeCashWith() {
        System.out.println("Free Cash Withdrawals");
    }

    @Override
    public void freeCheBook() {
        System.out.println("Free Cheque Book");
    }
}
