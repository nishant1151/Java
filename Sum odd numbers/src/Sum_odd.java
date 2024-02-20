public class Sum_odd {
    public boolean isOdd(int number){
        return number % 2 != 0 && number > 0;
    }
    public int sumOdd(int start,int end){
        int i,sum=0;
if(start>0 && end>0) {
    for (i = start; i <= end; i++) {
        if (isOdd(i)) {
            sum = sum + i;
        }
    }
return sum;
}
    return -1;


    }
}

