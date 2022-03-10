import java.util.*;
class A11{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a radius");
		double r= sc.nextDouble();
		//final double pi=22.0/7.0;

		double p  = Math.PI*r*2;
		double a = Math.PI*r*r;
		System.out.println("Perimeter is ="+p);
		System.out.println("Area is ="+a);

	}
}