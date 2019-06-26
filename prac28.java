//java arraylist
import java.util.*;


 public class prac28{

   static public void main(String name1[]){

   ArrayList<String>myarr=new ArrayList<String>();
   myarr.add("one");
   myarr.add("two");
   myarr.add("three");
   String aa=myarr.get(0);
   myarr.set(1,"one and half");
   System.out.println("this is the value"+aa); 

  for(String element:myarr){
      System.out.println(element);
    }

   ArrayList<StringBuilder>my=new ArrayList<StringBuilder>();
   my.add(new StringBuilder(" hi one"));
   my.add(new StringBuilder("hello two"));
   my.add(new StringBuilder("hell"));

  for(StringBuilder element: my){
    element.append(element.length());
   }

  for(StringBuilder element: my){
    System.out.println(element);
   }
   System.out.println("print the remaining");
  my.remove(new StringBuilder("hell"));

 for(StringBuilder element: my){
element.append(element.length());
    System.out.println(element);
   }

}
 }

 
