import java.util.Scanner;
class A20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int e= sc.nextInt();
		char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char []ar = new char[1000];
		int i=0;
		if(e==0)
			System.out.print(e);
		else{
		while(e!=0){
					int rem=e%16;
					e=e/16;				
					ar[i]=ch[rem];
					i++;
		}
		for(int k = i-1;k>=0;k--){
		System.out.print(ar[k]);
		}
		}
		
	}
}