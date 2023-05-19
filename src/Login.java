import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        String Sname, Password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Set Your User Name: ");
        Sname=sc.next();
        System.out.println("Set Your Password: ");
        Password=sc.next();
        System.out.println("------------");
        System.out.println("Login Here");
        System.out.println("------------");
        System.out.println("Enter Your User name");
        String name, Pass;
        name=sc.next();
        System.out.println("Enter Your Password");
        Pass=sc.next();
        if(Sname.equalsIgnoreCase(name) && Password.equals(Pass)){
            System.out.println("You are Successfully Logged in");
        }
        else{
            System.out.println("Error in password or username");
        }


    }
}