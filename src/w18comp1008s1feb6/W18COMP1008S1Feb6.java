package w18comp1008s1feb6;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JWright
 */
public class W18COMP1008S1Feb6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Fred","Flintstone","123",
                                LocalDate.of(1954, Month.MARCH, 10));
        Employee emp2 = new Employee("Jaret","Wright","456",
                                LocalDate.of(1962, Month.APRIL, 23));
        
        System.out.printf("Employee1: %s age: %d%n", emp1, emp1.getAge());
        System.out.printf("Employee2: %s age: %d%n", emp2, emp2.getAge());
        
    }
    
}
