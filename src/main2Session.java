import java.util.Scanner;


public class  main2Session {

    public static void main(String[] args){
    Scanner age_variable = new Scanner(System.in);

        System.out.println(ageDoubler(age_variable.nextInt()));


        }
    static int ageDoubler(int age){
        return age*2;
    }

    }

// int age ; => this is declaration
// age = 18 ; this is initialize
// deference between print and println ( we use println for times we want to /n our caret after print)


// Flow : Running line by line
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
// another conditional loops : Switch / while / do - while / for




// Function :
//int<type> <functionName> (<type> inputName){
//
//          Scope
//          return output;
//  }
