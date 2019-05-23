public class Car {
    private String quality;
    private int capacity;
//    void setQuality(String q){
//        this.quality= q;
//    }
//    void setCapacity(int c){
//        this.capacity=c;
//    }
    //--->Constructor way<-----
    public Car(String q, int c){
        this.quality = q;
        this.capacity = c;
    }
    String getQuality(){
        return this.quality;
    }
    int getCapacity(){
        return this.capacity;
    }
//    public void printCarInformation(){
//        System.out.println("quality is:"+this.quality);
//        System.out.println("capacity is:"+this.capacity);

//    }
}
