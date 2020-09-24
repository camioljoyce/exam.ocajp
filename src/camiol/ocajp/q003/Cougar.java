package camiol.ocajp.q003;
interface HasTail{
    int getTailLength();
}
abstract class Puma implements HasTail{
    public int getTailLength() {
        return 4;
    }
}
public class Cougar extends Puma{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Puma puma = new Cougar() ;
        System.out.println(puma.getTailLength());
    }
    public int getTailLength() {
        return 2;
    }

}
