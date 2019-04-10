import java.util.Scanner;
class Main
{
  public static int s(int sa)
  {
    return sa*sa;
  }
    
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a;
      a=s(n);
      System.out.println(a);
	} 
}