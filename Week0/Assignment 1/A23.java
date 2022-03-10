import java.util.Scanner;
class A23{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int c=0;
		int i=0;
		while(a!=0){
				int rem=a%10;
				a=a/10;
				c=(int)(rem*Math.pow(2,i)+c);
				i++;
			}
			char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char []ar = new char[1000];
		i=0;
		if(c==0)
			System.out.print(c);
		else{
		while(c!=0){
					int rem=c%16;
					c=c/16;				
					ar[i]=ch[rem];
					i++;
		}
		for(int k = i-1;k>=0;k--){
		System.out.print(ar[k]);
		}
		}
		
	}
}