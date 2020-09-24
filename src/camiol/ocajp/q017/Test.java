package camiol.ocajp.q017;

import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(test((i)->{return i==5;}));
    }
    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }

}
