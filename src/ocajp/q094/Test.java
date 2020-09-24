package ocajp.q094;

public class Test {
    int x;
    int y;
    public void doStuff(int x,int y) {
        x = x;
        y = this.y;
    }
    public void display() {
        System.out.println(x+" "+y+":");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test m1 = new Test();
        m1.x = 100;
        m1.y = 200;
        Test m2 = new Test();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }

}
