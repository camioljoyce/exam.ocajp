package ocajp.q045;
class Vehicle{
    int x;
    Vehicle(){
        this(10);
    }
    Vehicle(int x){
        this.x = x;
    }
}
class Car extends Vehicle{
    int y;
    Car(){
        super();
       // this(20);
    }
    Car(int y){
        this.y = y;
    }
    public String toSting() {
        return super.x + ":"+this.y;
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
           Vehicle y = new Car();
           System.out.println(y);
    }

}
