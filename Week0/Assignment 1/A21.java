import java.util.Scanner;
class A21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int e= sc.nextInt();
		int []ar = new int[1000];
		int i=0;
		int f=0;
		while(e!=0){
					int rem=e%8;
					e=e/8;
					ar[i]=rem;
					i++;
		}
		for(int k = i-1;k>=0;k--){
		System.out.print(ar[k]);
		}
	}
}
