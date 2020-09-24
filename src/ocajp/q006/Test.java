package ocajp.q006;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a<b)?(a<c)?a:(b<c)?b:c:x;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        System.out.println("x:"+x);
    }

}
