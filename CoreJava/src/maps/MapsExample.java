package maps;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {
        Map<String , LocalDate> cal = new HashMap<>();
        cal.put("Party",LocalDate.of(2020, Month.FEBRUARY,12));
        cal.put("Party-1",LocalDate.of(2019, Month.DECEMBER,11));
        cal.put("Party-2",LocalDate.of(2020, Month.MARCH,13));
        // hash code is store in hashcode order
        cal.forEach((key,value)-> System.out.printf("on %TD you have %s \n",value,key));
        System.out.println("---------------------------");
        cal.compute("Party",(key,value)->value.plusDays(2));
        cal.forEach((key,value)-> System.out.printf("on %TD you have %s \n",value,key));
        System.out.println("---------------------------");
        cal.compute("new Party",(key,value)-> LocalDate.of(2020, Month.OCTOBER,31));
        cal.forEach((key,value)-> System.out.printf("on %TD you have %s \n",value,key));


    }
}
