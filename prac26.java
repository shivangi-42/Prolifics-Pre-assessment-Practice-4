//java array

 public class prac26{

   static public void main(String name1[]){

  int array[]=new int[4];
  System.out.println(array[0]);
  String dd[]=new String[3];
   System.out.println(dd[0]);

   int ar[]={0,1};
  int a[][]={{0,1},{3,4,5}};
 //throws the exception as the 0,2 position not exist
   //System.out.println(a[0][2]);

   String multi[][]=new String[][]{
                           {"a","b"},null,
                   {"jan","feb",null},
                     };
   System.out.println(multi[2][2]);
   //this is will throw null pointer exception 
   System.out.println(multi[1][0]);   

}
 }

 
