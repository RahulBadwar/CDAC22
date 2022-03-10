
import java.util.Scanner;
class A25{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int c=0;
		int i=0;
		while(a!=0){
				int rem=a%10;
				a=a/10;
				c=(int)(rem*Math.pow(8,i)+c);
				i++;
			}
			System.out.println(c);
}
}