package ocajp.q065;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String names[] = {"Thomas","Peter","Joseph"};
        String pwd[] = new String[3];
        int idx=0;
        try {
            for(String n:names) {
                pwd[idx] = n.substring(2,6);
                idx++;
            }
        }catch(Exception e) {
            System.out.println("Invalid name");
        }
        for(String p:pwd) {
            System.out.println(p);
        }
    }

}
