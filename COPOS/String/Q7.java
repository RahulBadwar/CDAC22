import java.util.*;  
 class Q7{    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string====: ");
	String sr=sc.nextLine();
	char ch[]=new char[sr.length()];
	for(int i=0;i<sr.length();i++){
		if(Character.isUpperCase(sr.charAt(i)))
			ch[i]=Character.toLowerCase(sr.charAt(i));
		else if(Character.isLowerCase(sr.charAt(i)))
		ch[i]=Character.toUpperCase(sr.charAt(i));
	else
		ch[i]=sr.charAt(i);
		
	}
for(int k=0;k<sr.length();k++){
		System.out.print(ch[k]);
	}
	
	
	
	}
 }