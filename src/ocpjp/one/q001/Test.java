package ocpjp.one.q001;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<String> nL = Arrays.asList("Jim", "John", "Jeff"); 
    Function<String, String> funVal = s ->"Hello : ".concat(s); 
    nL.stream().map(funVal).peek(System.out::print); 
  }

}
