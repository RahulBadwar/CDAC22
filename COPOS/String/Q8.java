import java.util.*;  
 class Q8{    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string====: ");
	String sr=sc.nextLine();
	String sr1="";
	for(int i=sr.length()-1;i>=0;i--){
		sr1=sr1+sr.charAt(i);
		
	}	
	System.out.println(sr1);
	
	}
 }