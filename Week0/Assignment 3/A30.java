import java.util.Scanner;
class A30{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
			System.out.print("*");
			}
		System.out.println();
		}
		for(int i=1;i<=n-1;i++){
			for(int j=0;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
		}
		
	}
}