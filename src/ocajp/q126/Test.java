package ocajp.q126;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] arr = {"Hi","How","Are","You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s->{
            System.out.println(s);
            return s.length()<=2;
        })) {
            System.out.println("removed");
        }
        System.out.println("=======");
        for(String s:arrList) {
            System.out.println(s);
        }
    }

}
