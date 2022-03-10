import java.util.Scanner;
class P1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
			System.out.print(" ");
			}
			for(int l=1;l<=i;l++){
			System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
	}
}