import java.util.*;  
 class Q3{    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string====: ");
	String sr=sc.nextLine();
	char ch[]=new char[sr.length()];
	int j=0;
	int i=0;
	String sr1="";
	for(i=0;i<sr.length()-1;i++){
		if(sr.charAt(i)==sr.charAt(i+1)){
			
			continue;
		}
		sr1=sr1+sr.charAt(i);
	j++;	
}
sr1=sr1+sr.charAt(i);
	System.out.println(sr1);
	
	
	}
 }