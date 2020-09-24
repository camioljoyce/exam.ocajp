package ocajp.q120;
class A{
    public void test() {
        System.out.println("A ");
    }
}
class B extends A{
    public void test() {
        System.out.println("B ");
    }
}
class C extends A{
    public void test() {
        System.out.println("C ");
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A b1 = new A();
        A b2 = new C();
        A b3 = (B)b2;
        b1 = (A)b2;
        b1.test();
        b3.test();
        
    }

}
