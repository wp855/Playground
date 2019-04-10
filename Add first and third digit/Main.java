import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int num;
      Scanner input=new Scanner(System.in);
        num=input.nextInt();
      int a=num/100;
      int b=num%10;
      System.out.println(a+b);
	}
}