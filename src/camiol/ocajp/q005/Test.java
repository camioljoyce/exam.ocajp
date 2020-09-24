package camiol.ocajp.q005;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
            System.out.print("a");
             try {
             System.out.print("b");
             throw new IllegalArgumentException();
             } catch (RuntimeException e) {
             System.out.print("c");
             } finally {
             System.out.print("d");
             }
             System.out.print("e");
    }

}
