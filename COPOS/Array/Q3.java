import java.util.*;  
 class Q3{
	 public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of array====: ");
	int n= sc.nextInt();
	int arr[]=new int[n];
	int i=0;
	int j=0;
	while(j<n){
		arr[j++]=(int)(Math.pow((2*i+1),3));
		if(n>j)
		arr[j++]=(int)(Math.pow((2*i+2),2));
		i++;
		}
		for(int x:arr){
			
			System.out.print(x+" ");
		}
	
	
	
	
	 }
 }