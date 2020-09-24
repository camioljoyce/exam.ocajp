package ocajp.q136;
class Base{
    int a;
    public void test() {
        System.out.println("Base ");
    }
    public void a() {
        System.out.println("a");
    }
}
class DerivedA extends Base{
    int b;
    public void test() {
        System.out.println("DerivedA ");
    }
    public void b() {
        System.out.println("b");
    }
}
class DerivedB extends DerivedA{
    int c;
    public void test() {
        System.out.println("DerivedB ");
    }
    public void c() {
        System.out.println("c");
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        
        b1 = (Base) b3;
        Base b4 = (DerivedA) b2;
        
        b1.test();
        b4.test();
    }

}
