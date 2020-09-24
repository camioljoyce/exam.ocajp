package ocajp.q011;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            int num = 10;
            int div = 0;
            int ans = num/div;
        }catch(ArithmeticException ae) {
           // ans = 0;
        }catch(Exception e) {
            System.out.println("Invalid calculation");
        }
        
        //System.out.println("Answer = "+ans);    
    }

}
