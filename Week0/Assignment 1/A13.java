import java.util.*;
class A13{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Width and Height");
		float w= sc.nextFloat();
		float h= sc.nextFloat();
		System.out.println("Perimeter is ="+w*h);
		System.out.println("Area is ="+2*(w+h));

	}
}