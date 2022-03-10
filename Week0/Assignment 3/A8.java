import java.util.Scanner;
class A8{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n-1;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=n-i+1;j<=n;j++){
				System.out.print(j+" ");
				}
				
				System.out.println();
		}
	}
}