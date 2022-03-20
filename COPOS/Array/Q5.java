import java.util.*;  
 class Q5{    
 
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
	int temp1,temp2,temp3;
	temp1=temp2=temp3=a[0];
	int b[]=new int[3];
	for(int i=0;i<a1;i++){
			if(a[i]>temp1)
			{
				temp1=a[i];
			}
		}
		for(int i=0;i<a1;i++){
			if(a[i]<temp1&&a[i]>temp2)
			{
				temp2=a[i];
			}
		}
		for(int i=0;i<a1;i++){
			if(a[i]<temp1&&a[i]<temp2&&a[i]>temp3)
			{
				temp3=a[i];
			}
		}
		
			System.out.println("Third largest element is"+temp3);

		
		
		
	}
	
	

 }