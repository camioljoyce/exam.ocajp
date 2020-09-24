package ocajp.q034;
class Caller{
    private void init() {
        System.out.println("Init");
    }
    private void start() {
        init();
        System.out.println("start");
    }
}
public class TestCaller {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Caller c = new Caller();
//        c.start();
//        c.init();
    }

}
