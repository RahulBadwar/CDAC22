import java.util.*;  
 class Q6{    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string====: ");
	String sr=sc.nextLine();
	int count=0;
	int track=0;
	for(int i=0;i<sr.length();i++)
	{	for(int j=1;j<sr.length();j++){
		if(sr.charAt(i)==sr.charAt(j)){
			track=j;
			count++;
			break;
		}
	}
	String s2=sr.substring(0,track-1);
	}
	if(3*track-1==sr.length()){
	String s2=sr.substring(0,track-1);
	String s3=sr.substring(track,track+track-1);
	String s4=sr.substring(track+track,3*track-1);
	if(s2==s3&&s2==s4&&s3==s4){
		System.out.println("Repeated three times");
		
	}
	else{
		System.out.println("not three times");
	}
	
	
	System.out.println(sr);
	}
	
 }
 }