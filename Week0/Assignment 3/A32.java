import java.util.Scanner;
class A32{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=1;k<i;k++){
			System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++){
			System.out.print("* ");
			}
		System.out.println();
		}
		for(int i=1;i<=n-1;i++){
			for(int k=n-1;k>i;k--){
			System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
			System.out.print("* ");
			}
		System.out.println();
		}
		
	}
}