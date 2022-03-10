import java.util.Scanner;
class A9{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++){
			for(int k=n-1;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=n;j>n-i;j--){
				System.out.print(ch+" ");
				ch++;
				}
				ch='A';
				System.out.println();
		}
	
	}
}