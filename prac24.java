//java string

 public class prac24{

   static public void main(String name1[]){


     String str1=new String("shivangi");

      //print the character at the 0 position 
    System.out.println(str1.charAt(0));
     
   StringBuilder aa=new StringBuilder("shivangi12");
   //aa.insert(aa,"12");
   aa.append("****"); 
   aa.append("divya"); 
   aa.append(new String("hi"));

   //eg aa=divya
   aa.append("hii",0,1);
   System.out.println(aa);
   //output:: divyah

   aa.replace(1,4,"nnnnnnnnn");

    System.out.println("\n \n");
    StringBuilder dd=new StringBuilder("shivam");
    dd.insert(3,"ddd");
   System.out.println(dd);

   
   StringBuilder d1=new StringBuilder("1234");
   char name[]={'j','a','v','a'};
   d1.insert(1,name,1,3);
   System.out.println(d1);

   StringBuilder sb1=new StringBuilder("0123456");
    sb1.delete(2,4);
      sb1.deleteCharAt(2);
    System.out.println(sb1);
       
    
     
}
 }

 
