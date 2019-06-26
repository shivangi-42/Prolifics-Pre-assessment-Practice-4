//java arraylist
import java.util.*;
class person{
  String name;

   person(String name){
     this.name=name;
    }
}

 public class prac29{

   static public void main(String name1[]){

   ArrayList<person>myarr=new ArrayList<person>();
    person a1=new person("jaya");
    person a2=new person("divya");
    person a3=new person("shivangi");
    myarr.add(a1);
    myarr.add(a2);
   myarr.add(a3);
  
 myarr.remove(a1);

 for(person element:myarr){
       
      System.out.println("hi"+element.name);
    }


    ArrayList<person>my=new ArrayList<person>();
    person a4=new person("div");
   person a5=new person("shiv");
    my.add(a4);
   my.add(a5);
  
//you can give the posititon to add the other object in the given arary list  
   myarr.addAll(0,my);
  myarr.remove(3);

   for(person element:myarr){
       
      System.out.println("hello"+element.name);
    }


   
}
 }

 
