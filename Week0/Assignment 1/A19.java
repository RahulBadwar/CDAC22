import java.util.*;
class A25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int e= sc.nextInt();
		int []ar = new int[16];
		//rem = 0;
		int i=0;
		int f=0;
		while(e!=0){
					int rem=e%2;
					e=e/2;
					ar[i]=rem;
					i++;
		}
		for(int k = i-1;k>=0;k--){
		System.out.print(ar[k]);
		}
	}
}