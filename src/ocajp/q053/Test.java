package ocajp.q053;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> lst = Arrays.asList("A","B","C","D");
        Iterator<String> itr = lst.iterator();
        while(itr.hasNext()) {
            String e = itr.next();
            if(e=="C") {
                break;
            }else {
                System.out.println(e);
                continue;
            }
        }
    }

}
