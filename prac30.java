//java arraylist
import java.util.*;

 public class prac30{

   static public void main(String name1[]){

   ArrayList<String>my=new ArrayList<String>();
      String one="One";
       String two="Two";
    my.add(one);
    my.add(two); 
   ArrayList<String>myy=my;
     one.replace("O","B");
       System.out.println(one);   
      System.out.println(my);
    System.out.println(myy);

 ArrayList<StringBuilder>m=new ArrayList<StringBuilder>();

 StringBuilder sb1=new StringBuilder("jan");
 StringBuilder sb2=new StringBuilder("feb");
 StringBuilder sb3=new StringBuilder("mar");
 StringBuilder sb4=new StringBuilder("apr"); 

 m.add(sb1);
 m.add(sb2);
 m.add(sb3);
 m.add(sb4);
 
 System.out.println(m.contains(sb2));
 System.out.println(m.contains(new StringBuilder("feb")));
 System.out.println(m.indexOf(sb2));
 System.out.println(m.indexOf(new StringBuilder("feb")));
 System.out.println(m.lastIndexOf(new StringBuilder("feb")));
   
}
 }

 
