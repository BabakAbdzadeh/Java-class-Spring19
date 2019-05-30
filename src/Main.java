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


        Teacher t=new Teacher("parham","4 years"); // مقدار دهی اولیه با تابع سازنده
        Student s=new Student("mehdi", 935122007);
        t.print();
        s.print();
        t.setName("mohammad");  //مقدار دهی ثانویه چون درون (t,s) است ، اسم های قبلی پاک میشن
        s.setName("ahmad");     //ولی چون یه پرینت قبل تغییرات گرفتم ، نمایشش رو run میونه
        t.print();  // this ( t ) is reference name
        s.print();
        t.setName("jack");     //با یکبار استقاده از تابع سازنده، میتوان با set بار ها تغییر داد
        t.setJobHistory("5 years");
        s.setName("nick");
        s.setStdId(935122008);
        t.print();
        s.print();


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