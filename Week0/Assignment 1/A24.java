import java.util.Scanner;
class A24{
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
			System.out.println(c);
		int []ar = new int[1000];
		i=0;
		int f=0;
		while(a!=0){
					int rem=a%8;
					a=a/8;
					ar[i]=rem;
					i++;
		}
		for(int k = i-1;k>=0;k--){
		System.out.print(ar[k]);
		}
		
	}
}