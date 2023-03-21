package ex18_interface;

public class TestBank {
    public static void main(String[] args) {
        BobBank bobBank = new BobBank();
        bobBank.freeSavingAct();
        bobBank.freeCashWith();
        bobBank.freeDebitCard();
        bobBank.freeCheBook();
    }
}
