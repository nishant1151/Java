
public class Last_digit_checker {
    public  boolean hasSamelastDigit(int number1,int number2,int number3){
    int numb1,numb2,numb3;
    if(isvalid(number1) && isvalid(number2) && isvalid(number3)){
        numb1=number1%10;
        numb2=number2%10;
        numb3=number3%10;
        return numb1 == numb2 || numb2 == numb3 || numb1 == numb3;
    }
    return false;
}
public boolean isvalid(int number){
 return number>10 && number<1000;
}
}
