//java arraylist
import java.util.*;
import java.time.LocalDate;

 public class prac31{

   static public void main(String name1[]){
ArrayList<Integer> lst = new ArrayList<>();
lst.add(1000);


ArrayList<String> ejg = new ArrayList<>();
ejg.add("One");
ejg.add("Two");
System.out.println(ejg.contains(new String("One")));

   LocalDate dat1=LocalDate.of(2019,12,27);
   System.out.println("th date is :"+dat1);

  LocalDate dat2=LocalDate.of(2019,11,27);
  System.out.println("th date is :"+dat2);
  
    
 
  LocalDate dat4=LocalDate.now();
   System.out.println("th date is :"+dat4);

   LocalDate dat3=LocalDate.parse("2012-03-07");

   System.out.println("th date is :"+dat3.getDayOfMonth());

  System.out.println("th date is :"+dat3.minusDays(2));

System.out.println("th date is :"+dat3.plusDays(2));


}
 }

 








