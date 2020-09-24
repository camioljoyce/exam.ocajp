package ocajp.q123;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 1;
        int y = 1;
        if(x++<++y) {
            System.out.println("Hello");
        }else {
            System.out.println("Welcome");
        }
        System.out.println("Log"+x+":"+y);
    }

}
