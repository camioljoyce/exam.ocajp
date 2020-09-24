package camiol.ocajp.q008;
class Deer{
    public Deer() {
        System.out.println("Deer");
    }
    public Deer(int age) {
        System.out.println("DeerAge");
    }
    private boolean hasHorns() {
        return false;
    }
}
class Reindeer extends Deer{
    public Reindeer(int age) {
        System.out.println("Reindeer");
    }
    public boolean hasHorns() {
        return true;
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Deer deer = new Reindeer(5);
//        System.out.println(","+deer.hasHorns());
    }

}
