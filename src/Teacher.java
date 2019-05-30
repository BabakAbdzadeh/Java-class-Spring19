import javax.lang.model.element.NestingKind;

public class Teacher {

    private  String name;
    private String  jobHistory;
    public  String getName(){

        return  this.name;
    }
    public  void  setName (String n){

        this.name=n;
    }

    public  Teacher(String name, String jobHistory){

        this.name=name;
        this.jobHistory = jobHistory;
    }

    public String getJobHistory() {
        return jobHistory;
    }

    public void setJobHistory(String jobHistory) {
        this.jobHistory = jobHistory;
    }

    public  void print(){

        System.out.println(this.name+"\t"+this.jobHistory);
    }
}