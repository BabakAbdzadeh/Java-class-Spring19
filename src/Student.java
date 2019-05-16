public class Student {
    String name;
    String family;
    int stdID;
    void printStudent()
    {
        System.out.println(this.name);
        System.out.println(this.family);
        System.out.println(this.stdID);


    }
    public Student(String name,String family,int stdID){
        this.name = name;
        this.family = family;
        this.stdID = stdID;

    }
}
