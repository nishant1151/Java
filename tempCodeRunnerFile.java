public class Utilities{
			
		public void factorial(int number){
			int i,fact=1;
			for(i=1;i<=number;i++){
				fact=fact*i;
			}
			System.out.println(fact);
			
		}
		
		public void reverseNumber(int number){
			int reverse=0, remiander=0;
			while (number!=0){
				remiander=number%10;
				number=number/10;
				reverse=reverse*10+remiander;
			}
			System.out.println(reverse);
		}
		public void sumOfDigits(int number){
			int i, temp,sum=0;
			while(number!=0){
				temp=number%10;
				number=number/10;
				sum=sum+temp;
		}}
		public void fibonachiSeries(int number){
			int i ,temp=1,sum=0,fibonachi;
			
			for(i=0;i<number;i++){
				if(i==0||i==1){
					System.out.println(i);
				}
				else{
					fibonachi=sum+temp;
					sum=temp;
					temp=fibonachi;
					System.out.println(fibonachi);
				}
				
		}}
			
			public void primeNumber(int number){
				int i;
				boolean flag=false;
				for(i=2;i<number;i++){
					if(number%i==0){
						flag=true;
						break;
					}
				}
				if(flag==false){
					System.out.println(number+" is Prime number");
					
				}
				else{
					System.out.println(number+" is not Prime number");
				}
			}
		
		
		
		
			
			
		
}