package ocajp.q087;
class C{
    public C() {
        System.out.println("C");
    }
}
class B extends C{
    public B() {
        System.out.println("B");
    }
}
class A extends B{
    public A() {
        System.out.println("A");
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A a = new A();
        
    }

}
