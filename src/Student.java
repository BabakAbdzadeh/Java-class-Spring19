public class Student {

    private String name;
    private int stdId;
    // alt + enter for making fast getter and setter and constructor


    public String getName(){
        return this.name;
    }

    public void setName (String n){

        this.name= n;

    }

    public  Student(String Name, int stdId){

        this.name=Name;
        this.stdId = stdId;
    }


    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }


//    public int getStdId(){
//        return this.stdId;
//    }
//
//    public void setStdId(int  n){
//        this.stdId= n;
//    }
//
//
//    public Student(int stdId){
//        this.stdId=stdId;
//    }
//

    public  void print(){
        System.out.println(this.name+"\t"+this.stdId);
    }

}
