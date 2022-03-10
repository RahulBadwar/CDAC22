import java.util.*;
class A17{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=0,d=0;
		int i=0;
			while(a!=0){
				int rem=a%10;
				a=a/10;
				c=(int)(rem*Math.pow(2,i)+c);
				i++;
			}
			i=0;
			while(b!=0){
				int rem=b%10;
				b=b/10;
				d=(int)(rem*Math.pow(2,i)+d);
				i++;
			}
			int []ar = new int[16];
			 i =0;
			 int e=d+c;
		while(e!=0){
					int rem=e%2;
					e=e/2;
					ar[i]=rem;
					i++;
		}
		for(int k = i-1;k>=0;k--){
		System.out.print(ar[k]);
		}
		
		//System.out.println(g);
	}
}