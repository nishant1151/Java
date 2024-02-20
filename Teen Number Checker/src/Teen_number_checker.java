public class Teen_number_checker {

    public boolean hasTeen(int number1,int number2,int number3){
        if(number1>12 && number1<20 || number2>12 && number2<20 || number3>12 && number3<20){
            return true;
        }
        else {
            return false;
        }

    }
    public boolean isTeen(int number){
        if(number>12 == number<20){
            return true;
        }
        else{
            return false;
        }
    }
}
