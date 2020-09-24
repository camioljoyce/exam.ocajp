package ocajp.q160;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String stuff = "TV";
        String res = null;
        if(stuff.equals("TV")) {
            res = "Walter";
        }else if(stuff.equals("Movies")) {
            res = "White";
        }else {
            res = "No result";
        }
        
        String res1 = stuff.equals("TV")?"Walter":stuff.equals("Movies")?"White":"No result";
        System.out.println(res);
        System.out.println(res1);
    }

}
