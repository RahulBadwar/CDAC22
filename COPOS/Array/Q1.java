import java.util.*;  
 class Q1{    
			static int[] setData(int a1){
			 Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Array==:");
			int a[]=new int[a1];
			for(int i=0;i<a.length;i++){
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
	System.out.println("Enter length of array2====: ");
	int a2=sc.nextInt();
	int b[]=new int[a2];
	b=setData(a2);
	int c[]=new int[a1+a2];
	int j=0;
	int k=0;
	for(int i=0;i<((a.length+b.length));i=i+2)
	{
		if(j<a.length){
		c[i]=a[j];
		j++;
		}
		else{
			c[i]=b[k];
		}
	if(k<b.length){
		c[i+1]=b[k];
		k++;
	}
	else{
		c[i+1]=a[j];
	}
	}
	for(int i=0;i<c.length;i++ ){
		System.out.print(c[i]+" ");
	}
	
	
	}
	
 }