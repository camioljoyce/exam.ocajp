package ocajp.q003;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x = 1;
        int y = 0;
        if(x++ > ++y) {
            System.out.println("Hello");
        }else {
            System.out.println("Welcome");
        }
        System.out.println("Log"+x+":"+y);
    }

}
