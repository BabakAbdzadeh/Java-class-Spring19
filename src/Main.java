import org.jetbrains.annotations.Contract;

import java.util.Scanner;


//public class  main2Session {
//
//    public static void main(String[] args){
//        String name = "babak";
//        String family = "abdzadeh";
//        int stdID = 935122007 ;
//        Student firstStudent =new Student(name,family,stdID);
//        firstStudent.printStudent();
//    }
//
//
//    }

public class Main {

    public static void main(String[] args) {


        Teacher a=new Teacher("parham");
        Student b=new Student("mehdi");
        a.print();
        b.print();
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


// DRY ( Dont Repeat Yourself)

// real world : (with Ex)
// 1. Requirement : getting fullName , printing StdNumber
// 2. Diagram Design (Schematic)
// 3. Code