import java.util.Scanner;
class Subtract{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Difference is "+(a-b));
		sc.close();
	}
}
