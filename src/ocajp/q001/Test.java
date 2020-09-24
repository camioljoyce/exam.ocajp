package ocajp.q001;

public class Test {
    int x,y;
    public Test(int x, int y) {
        this.x = x*x;
        this.y = y*y;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 9, y = 5;
        Test obj = new Test(x, y);
        System.out.println(x+" "+y);
    }

}
