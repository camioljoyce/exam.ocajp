package ocajp.q022;

public class Test {
    int a1;
    public static void doProduct(int a) {
        a = a*a;
    }
    public static void doString(String s) {
        s.concat(" "+s);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test item = new Test();
        item.a1 = 11;
        String sb = "Hello";
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+" "+sb+" "+item.a1);
    }

}
