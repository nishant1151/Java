import java.util.Scanner;

class FirstProgram{

		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int num=sc.nextInt();
			/* factorial
			int temp=1,sum1=0,sum=0,i=0;
			
			for(i=0;i<num;i++){
				if(i==0){
					System.out.println(0);
				}
				else if(i==1){
					System.out.println(1);
				}
				else{
				sum=sum1+temp;
				sum1=temp;
				temp=sum;
				System.out.println(sum);
				}
				
		}*/
		/*palindroe
		int temp=num,rem=0,rev=0;
		while(temp!=0){
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		if(num==rev){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}*/
		
		
		/*amstrong number
		*/
		 int j,count=0,i,pow=1,temp,temp2=num,add=0;
		 temp=num;
		 while(temp!=0){
			 temp=temp/10;
			 count++;
		 }
		 
		 for(i=0;i<count;i++){
			 pow=1;
			 temp=num%10;
			for(j=0;j<count;j++){
				pow=temp*pow;
				
			}
			System.out.println(pow);
			add=add+pow;
			num=num/10;
		 }
		 System.out.println(add);
		 if(temp2==add){
			 System.out.println("yes");
		 }
		else{
		System.out.print("no");
		}
		
		
			
			
		}
}

