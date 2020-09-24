package ocajp.q116;
class Caller{
    private int i;
    private void init() {
        System.out.println("init");
    }
    private void start() {
        init();
        System.out.println("start");
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Caller c = new Caller();
//        c.start();
//        c.init();
//        c.i;
    }

}
