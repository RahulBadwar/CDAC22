import java.util.Scanner;
class A25{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int l=1;l<i;l++){
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i=1;i<=n-1;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--){
				System.out.print("*");
			}
			for(int l=n-1;l>i;l--){
				System.out.print("*");
			}
			
			System.out.println();
			}
	}
}
