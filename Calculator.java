import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The sum is: "+(a+b));
		sc.close();
	}
}
