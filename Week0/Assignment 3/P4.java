import java.util.Scanner;
class P4{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=2*(n-i);k>=1;k--){
			System.out.print(" ");
			}
			for(int l=1;l<=i;l++){
			System.out.print(l+" ");
			}
			for(int j=i-1;j>=1;j--){
			System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}