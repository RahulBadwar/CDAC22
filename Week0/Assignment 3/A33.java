import java.util.Scanner;
class A33{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n-1;i++){
			System.out.print("*");
			
			for(int k=1;k<=i-2;k++){
			System.out.print(" ");
			}
			if(i==1){
				System.out.println();
				continue;
			}
			System.out.print("*");
			System.out.println();
			
		}
		for(int i=1;i<=n;i++){
			System.out.print("*");
		}
		
	}
}
	