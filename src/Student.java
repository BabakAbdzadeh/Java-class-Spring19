public class Student {

    private String name;

    public String setName (){

        return  this.name;

    }

    public  Student(String Name){

        this.name=Name;
    }
    public  void print(){
        System.out.println(this.name);
    }

}
