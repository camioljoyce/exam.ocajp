package ocajp.q023;

public class Test {
    public static final int MIN = 1;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "1";
        int x = str.length();
        if(checkLimit(x)) {
            System.out.println("JAVA SE");
        }else {
            System.out.println("JAVA EE");
        }
    }
    public static boolean checkLimit(int x) {
        return (x>=MIN)?true:false;
    }

}
