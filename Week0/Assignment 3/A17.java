import java.util.Scanner;
class A17{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(sum+" ");
				sum++;
			}
			System.out.println();
			
		}
		
		
		
	}
}