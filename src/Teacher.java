public class Teacher {

    private  String name;
    public  String getName(){

        return  this.name;
    }
    public  void  setName (String n){

        this.name=n;
    }

    public  Teacher(String name){

        this.name=name;
    }

    public  void print(){

        System.out.println(this.name);
    }
}
