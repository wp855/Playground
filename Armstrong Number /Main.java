/*import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
	}
}*/
    import java.util.Scanner;
     
    class Main
    {
       public static void main(String args[])
       {
          int n, sum = 0, temp, remainder, digits = 0;
     
          Scanner in = new Scanner(System.in);
               
          n = in.nextInt();
     
          temp = n;
         
         
          while (temp != 0) {
             digits++;
             temp = temp/10;
          }
     
          temp = n;
     
          while (temp != 0) {
             remainder = temp%10;
             sum = sum + power(remainder, digits);
             temp = temp/10;
          }
     
          if (n == sum)
             System.out.println("Armstrong Number");
          else
             System.out.println( "Not a Armstrong Number");        
       }
       
       static int power(int n, int r) {
          int c, p = 1;
     
          for (c = 1; c <= r; c++)
             p = p*n;
     
          return p;  
       }
    }