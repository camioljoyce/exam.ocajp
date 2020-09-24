package camiol.ocajp.q016;
interface Animal { 
    public default String getName() { return null; } 
}
 interface Mammal { public default String getName() { return null; } }
// abstract class Otter implements Mammal, Animal {}

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        A. The code compiles without issue.
//        B. Remove the default method modifier and method implementation on line 1.
//        C. Remove the default method modifier and method implementation on line 2.
//        D. Remove the default method modifier and method implementation on lines 1 and 2.
//        E. Change the return value on line 1 from null to "Animal".
//        F. Override the getName() method with an abstract method in the Otter class.
//        G. Override the getName() method with a concrete method in the Otter class.
        System.out.println("CFG");
    }

}
