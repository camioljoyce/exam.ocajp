package ocajp.q105;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println(isAvailable);
        Test ts = new Test();
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
        
    }
    public static boolean doStuff() {
        return !isAvailable;
    }
    static boolean isAvailable = true; 

}
