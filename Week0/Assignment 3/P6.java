import java.util.Scanner;
class P6{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=1;k<i;k++){
			System.out.print(" ");
			}
			for(int l=n;l>=i;l--){
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
	}
}