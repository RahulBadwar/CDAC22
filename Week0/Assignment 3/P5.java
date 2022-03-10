import java.util.Scanner;
class P5{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=2*(n-i);k>=1;k--){
			System.out.print(" ");
			}
			for(int l=n-i+1;l<=n;l++){
			System.out.print(l+" ");
			}
			for(int j=n-1;j>n-i;j--){
			System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}