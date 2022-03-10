import java.util.*;
class A15{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number1");
		int n1= sc.nextInt();
		System.out.println("Enter a number2");
		int n2= sc.nextInt();
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping number1 is "+ n1+" number2 is " +n2);

	}
}