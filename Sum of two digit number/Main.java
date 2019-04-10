import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int a=num%10;
      int b=num/10;
      System.out.println(a+b);
	}
}