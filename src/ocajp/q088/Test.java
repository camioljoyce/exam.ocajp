package ocajp.q088;
class Bird{
    int x;
    public void fly() {
        System.out.println("Fly");
    }
}
class Peacock extends Bird{
    int y;
    public void dance(){
        System.out.println("Dance");
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Bird p = new Peacock();
        Bird b = new Bird();
        Peacock p = (Peacock)b; 
        p.fly();
        p.dance();
        
    }   

}
