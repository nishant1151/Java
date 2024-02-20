public class Time{
	private int sec;
	private int min;
	private int hour;
	
	public Time(){
		sec=0;
		min=0;
		hour=0;
	}
	
	public Time(int sec,int min,int hour){
		this.sec=sec;
		this.min=min;
		this.hour=hour;
	
	
		
	}

		public void addTime(Time a){
			sec=a.sec+sec;
			min=a.min+min;
			hour=a.hour+hour;
			
			if(this.sec>=60){
			this.min++;
			this.sec=sec-60;
			if(this.min>=60){
				this.hour++;
				this.min=min-60;
			}
				}
		else if(this.min>=60){
			this.hour++;
			min=min-60;
		}
			
			
		}
	
	
	public void display(){
		System.out.println(hour+"-"+min+"-"+sec);
	}
	
}
