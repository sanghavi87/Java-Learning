package ex17_abstraction;

public class LoginPage extends Pages
{

    @Override
    public void header() {
        System.out.println("Login page Header");
    }

    @Override
    public void title() {
        System.out.println("Login page title");
    }

    @Override
    public void logo() {
        System.out.println("Login page Logo");
    }
    public void login(String Uname, String Pwd){
        System.out.println("Username is:"+Uname+"\n"+"Password is:"+Pwd);
    }
}
