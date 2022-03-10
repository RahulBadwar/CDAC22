import java.util.Scanner;
class A10{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int k=n-1;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=n;j>n-i;j--){
				System.out.print((char)(64+j)+" ");
				}
				System.out.println();
		}
	
	}
}