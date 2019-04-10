import java.util.Scanner;
class Main{
  public static int sum(int s)
  {
    int su=0;
    for(int i=1;i<=s;i++)
    {
      su=su+i;
    }
    return su;
  }
	public static void main (String[] args){
	    // Type your code here
	Scanner in=new Scanner(System.in);
      int su=in.nextInt();
        int a;
      a=sum(su);
      System.out.println(a);
    }
}