import java.util.*;  
 class Q4{    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string====: ");
	String sr=sc.nextLine();
	char ch[]=new char[sr.length()];
	int flag=0;
	for(int i=0;i<sr.length()-2;i++){
		if(sr.charAt(i)==sr.charAt(i+1)||sr.charAt(i+1)==sr.charAt(i+2)){
			//flag=1;
			continue;
		}
		else{
		System.out.println(sr.charAt(i+1));
		flag=0;
		break;
		}
		
}			if(flag==1){
			System.out.println("not found");
}
	
	
	
	
	}
 }