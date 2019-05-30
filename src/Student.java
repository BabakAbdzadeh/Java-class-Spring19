public class Student {

    private String name;
    public String getName(){
        return this.name;
    }

    public void setName (String n){

        this.name= n;

    }

    public  Student(String Name){

        this.name=Name;
    }
    public  void print(){
        System.out.println(this.name);
    }

}
