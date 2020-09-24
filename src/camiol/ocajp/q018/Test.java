package camiol.ocajp.q018;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
//        Which of the following print out a date representing April 1, 2015? (Choose all that apply)
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));
//        System.out.println(new LocalDate(2015, 3, 1));
//        System.out.println(new LocalDate(2015, 4, 1));
    }

}
