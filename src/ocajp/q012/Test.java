package ocajp.q012;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n[][] = {{1,3},{2,4}};
        for(int i = n.length-1;i>=0;i--) {
            for(int y: n[i]) {
                System.out.print(y);
            }
        }
    }

}
