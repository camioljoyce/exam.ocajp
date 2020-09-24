package ocajp.q145;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String arr[] = {"A","B","C","D"};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
            if(arr[i].equals("C")) {
                continue;
            }
            System.out.println("work done");
            break;
        }
    }

}
