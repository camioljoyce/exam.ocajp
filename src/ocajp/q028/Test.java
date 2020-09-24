package ocajp.q028;

import java.util.ArrayList;
import java.util.List;
import ocajp.q027.A;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        
        if(names.remove("Bran")) {
            names.remove("Jon");
        }
        
        System.out.println(names);
        
       
    }

}
