package ex17_abstraction;

public class TestPage {
    public static void main(String[] args)
    {
        LoginPage loginPage = new LoginPage();
        loginPage.header();
        loginPage.title();
        loginPage.logo();
        loginPage.login("Tester","123456");
        loginPage.logOut();

    }


}
