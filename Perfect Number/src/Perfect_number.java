public class Perfect_number {
    public boolean isPerfectNumber(int number){
        int add=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                add=add+i;
            }
        }
        return add==number;
    }
}
