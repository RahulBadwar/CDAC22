import java.util.*;  
 class Q1 {    
    public static void main(String args[]){    
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string====: ");

	String s1=sc.nextLine();
	int vovel=0;
	int constant=0;
	int num=0;
	int other=0;
	for(int i=0;i<s1.length();i++)
	{	char ch=s1.charAt(i);
		if(ch=='a'||ch=='o'||ch=='i'||ch=='u'||ch=='e'||ch=='A'||ch=='O'||ch=='I'||ch=='U'||ch=='E'){
			vovel++;
		}
		else if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){
			constant++;
		}
		else if(ch>=48&&ch<=57){
			num++;
		}
		else{
			other++;
		}
	}

			System.out.println("vovel=="+vovel);
			System.out.println("constant=="+constant);
			System.out.println("num=="+num);
			System.out.println("other=="+other);
	}
}