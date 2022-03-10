import java.util.Scanner;
class P13{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n-1;i++){
			for(int k=n-1;k>=i;k--){
			System.out.print(" ");
			}
			for(int l=i;l<=i;l++){
			System.out.print("*");
			}
			if(i==1){
				System.out.println();
				continue;
			}
			for(int m=1;m<(2*i-2);m++){
			System.out.print(" ");
			}
			for(int j=i;j<=i;j++){
			System.out.print("*");
			}
			System.out.println();
			}
			for(int i=1;i<=n;i++){
				System.out.print("* ");
			}
			
	}
}