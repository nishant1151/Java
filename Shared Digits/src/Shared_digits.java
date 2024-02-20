public class Shared_digits {

    public boolean hasSharedDigits(int number1,int number2){
        int i;
        if(number1>=10 && number1<=99 && number2>=10 && number2<=99){
            for(i=0;i<number1;i++){
                for(int j=0;j<number2;j++){
                    if(i==2 && j==2 || i==12 && j==12 || i==23 && j==23){
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
