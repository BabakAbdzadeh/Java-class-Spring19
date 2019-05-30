public class Teacher extends Person {


    private String  jobHistory;


    public  Teacher(String name,String jobHistory){

        this.name = name;
        this.setJobHistory(jobHistory);
    }

    public String getJobHistory() {
        return jobHistory;
    }

    public void setJobHistory(String jobHistory) {
        this.jobHistory = jobHistory;
    }

    public  void print(){

        System.out.println(this.name+"\t"+ this.jobHistory);
    }
}