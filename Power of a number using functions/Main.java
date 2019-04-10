import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    int r;
    r= e(base,exponent);
    System.out.println(r);
  }
  public static int e(int b, int c)
  {
    int r=1;
    for(int i=1; i<=c; i++)
    {
      r=r*b;
    }
    return r;
  }
}


	