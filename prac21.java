//java string

 public class prac21{

   static public void main(String name1[]){

    //for same strings only one string is created in the string pool
    String str3="shivangi";
    String str4="shivangi";
    
    System.out.println(str3==str4);
    System.out.println(str3.equals(str4));


    //if we create the string using the new operator the two different string is created but not in the string pool 

  // the == use to compare the reference

  // the equals is use to compare the values at that reference


     String str1=new String("shivangi");
    String str2=new String("shivangi");
    
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
     
    }
 }

 
