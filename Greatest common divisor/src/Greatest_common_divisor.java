public class Greatest_common_divisor {

    public int getGreatestCommonDivisor(int first,int second) {
        int result=-1;

        if(first>10 && second>10){
            for(int i=1;i<=first;i++){
                if(first%i==0){
                    for(int j=1;j<=second;j++){
                        if(second%j==0 && i==j){
                            result=i;
                        }
                    }
                }
            }
        }
        return result;

    }
}
