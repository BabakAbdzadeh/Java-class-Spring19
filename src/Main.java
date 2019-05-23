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

public class Main{
    public static void main(String[] args) {
        //-----> setter method <--------
//        Car pride = new Car();
//        Car benz = new Car();
//        pride.setQuality("bad");
//        pride.setCapacity(4);
//        benz.setQuality("perfect");
//        benz.setCapacity(5);
        // ------> Constructor <--------
        Car pride = new Car("bad",4);
        Car benz = new Car("perfect",5);



        System.out.println("prideInformation");
        System.out.println(pride.getQuality());
        System.out.println(pride.getCapacity());
//        pride.printCarInformation();
        System.out.println("benzInformation");
        System.out.println(pride.getQuality());
        System.out.print(benz.getCapacity());
//        benz.printCarInformation();
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