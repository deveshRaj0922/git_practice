import java.util.Scanner;
class Sentence{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sent=sc.next();
		System.out.println("Entered sentence is:\n\""+sent+"\"");
		sc.close();
	}
}
