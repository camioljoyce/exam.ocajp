package ocajp.q104;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList myList = new ArrayList<>();
        String[] myArray;
        try {
            while(true) {
                myList.add("My String");
            }
        }catch(RuntimeException re) {
            System.out.println("Caught a RuntimeException");
        }catch(Exception e) {
            System.out.println("Caught a Exception ");
        }catch(OutOfMemoryError err) {
            System.out.println("Caught OutOfMemoryError");
        }
        System.out.println("Ready to use");
    }

}
