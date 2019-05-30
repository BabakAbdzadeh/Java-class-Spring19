public class Person {
    protected String name;
    public String getName(){
        return this.name;
    }
    public void setName (String n){

        this.name= n;

    }
    public  Person(String name){

        this.setName(name);

    }
}
// inheritance