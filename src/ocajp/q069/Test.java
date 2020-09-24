package ocajp.q069;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        
        for(String[] c:shirts) {
            for(String s:c) {
                System.out.print(s+":");
            }
        }
    }

}
