import java.util.Scanner;

public class main2Session {
    public static void main(String[] args){
        System.out.print("enter your age please:");
        Scanner age_variable = new Scanner(System.in);
        int age = age_variable.nextInt();
        if (age > 15 && age < 24){
            System.out.println("you are young");
        }
        else if (age > 24 && age <50 ){
            System.out.println("you are middle age");
        }
        else if (age == 24){
            System.out.println("you are exactly 24");
        }
        else {
            System.out.println("we cant tell about you");
        }
    }
}
// int age ; => this is declaration
// age = 18 ; this is initialize
// deference between print and println ( we use println for times we want to /n our caret after print)


// Conditional loops :
// <<<if>>> example:
// int age = 18
// if ( age > 15 && age < 24 ) {
//    Scope
//    }
// else if(age>24 && age <50) {
//     scope
// }
// else {
// scope
//  {
//
