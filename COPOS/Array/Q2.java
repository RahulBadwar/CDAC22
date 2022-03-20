import java.util.*;  
 class Q2{    
 
		static int[] setData(int a1){
			 Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Array==:");
			int a[]=new int[a1];
			for(int i=0;i<a1;i++){
				a[i]=sc.nextInt();
				}
			
			return a;
		}
 
	public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of array1====: ");
	int a1=sc.nextInt();
	int a[]=new int[a1];
	a=setData(a1);
	
	int b[]=new int[a1-2];
	for(int i=0;i<a1-2;i++)
	{
		b[i]=(a[i]+a[i+1]+a[i+2])/3;
	}
	for(int x:b)
	{
		System.out.print(x+" ");
	}
	
	
	
	}
 }