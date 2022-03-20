import java.util.*;  
 class Q4{    
 
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
	int flag=0;
	for(int i=0;i<a1-1;i++){
		if(a[i]>a[i+1]){
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
		}
		if(flag==1){
			System.out.println("Descending====: ");
		}
		int flag1=0;
	for(int i=0;i<a1-1;i++){
		if(a[i]<a[i+1]){
			flag1=1;
		}
		else if(flag!=1){
			System.out.println("Random array1====: ");
			flag1=0;
			break;
		}
		
		}
		if(flag1==1){
			System.out.println("Ascending====: ");
			
		}
	
	
	
	
	
	}
 }
	