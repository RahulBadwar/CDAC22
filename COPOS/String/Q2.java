import java.util.*;  
 class Q2 {    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string====: ");
	String sr=sc.nextLine();
	String []str=sr.split(" ");
	
	for(int i=0;i<str.length;i++){
			String s3=str[i];
			//String s3 = s2.toLowerCase();
			if(i==0){
				if(i==0){
				char ch =s3.charAt(0);
				ch = Character.toUpperCase(ch);
			}
			}
			switch(s3)
			{
				case "zero":
				s3="one";
				break;
				case "one":
				s3="two";
				break;
				case "two":
				s3="three";
				break;
				case "three":
				s3="four";
				break;
				case "four":
				s3="five";
				break;
				case "five":
				s3="six";
				break;
				case "six":
				s3="seven";
				break;
				case "seven":
				s3="eight";
				break;
				case "eight":
				s3="nine";
				break;
				case "nine":
				s3="ten";
				break;
			}
			
				System.out.print(s3+" ");
			
		}
	
	
	
	
	}
 }