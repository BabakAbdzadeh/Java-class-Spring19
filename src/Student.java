public class Student extends Person{


    private int stdId;
    // alt + enter for making fast getter and setter and constructor



    public  Student(String name,int stdId){
        super();
        this.name= name;
        this.setStdId(stdId);
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
        System.out.println(this.name+"\t"+ this.stdId);
    }

}
