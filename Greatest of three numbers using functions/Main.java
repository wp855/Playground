import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
	  int n2=in.nextInt();
      int n3=in.nextInt();
      int r;
      r=great(n1,n2);
      if(r>n3)
      {
        System.out.println(r);
      }
      else
        System.out.println(n3);
	}
  public static int great(int a, int b)
  {
    if(a>b)
    {
      return a;
    }
    else
      return b;
  }
}