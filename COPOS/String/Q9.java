import java.util.*;  
 class Q9{    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string 1====: ");
	String s1=sc.nextLine();
	System.out.println("Enter your string 2====: ");
	String s2=sc.nextLine();
	s1 = s1.toLowerCase();
	s2 = s2.toLowerCase();						    
	char[] arr1 = s1.toCharArray(); 		
	char[] arr2 = s2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	int n=arr1.length;
	int m=arr2.length;
	for(int i=0; i < arr1.length-1; i++){
		if(arr1[i]!=arr1[i+1]||arr1[i+1]==arr1[n-1]){
		for(int j=0; j < arr2.length-1; j++){
			if(arr2[j]!=arr2[j+1]||arr2[j+1]==arr2[m-1]){
			if(arr1[i] == arr2[j]){
				if(arr1[i]!=' '){
				System.out.print(arr1[i]+" ");
				}
			}				
			}
		}
		}
	}
	if(arr1[arr1.length-1]==arr2[arr2.length-1]){
		System.out.print(arr1[arr1.length-1]+" ");
	}
	
	
	
	}
 }