//java string

 public class prac23{

   static public void main(String name1[]){


     String str1=new String("shivangi");

      //print the character at the 0 position 
    System.out.println(str1.charAt(0));
     
     // print the index of the character
    System.out.println(str1.indexOf('i'));
    System.out.println(str1.indexOf('i',4)); 
    
    //print the substring

      String sub=str1.substring(0,4);
System.out.println(sub);

   // remove the spaces

       String str=" fish aa ";
      System.out.println(str.trim());

   // replace the a character by another character
   System.out.println(str.replace('a','j'));

  // startswith and endswith return the true and false 
     System.out.println(str.startsWith(" "));    
    System.out.println(str.endsWith(" "));

   String aa=new String(str);

   
}
 }

 
