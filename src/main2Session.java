import java.util.Scanner;

public class main2Session {
    public static void main(String[] args){
        System.out.print("enter your age please:");
        Scanner age_variable = new Scanner(System.in);
        int age = age_variable.nextInt();
        System.out.println("Your age is:"+age);
    }
}
