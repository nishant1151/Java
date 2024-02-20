public class Number_to_words {
    public void numberTowords(int number){
       int reverse_number,temp, count=getDigitCount(number), i=0;
        if(number>=0){
            reverse_number=reverse(number);
            while(i<getDigitCount(number)){
                temp=reverse_number%10;
                reverse_number=reverse_number/10;

                switch(temp){
                    case 1-> System.out.print("one ");
                    case 2-> System.out.print("two ");
                    case 3-> System.out.print("three ");
                    case 4-> System.out.print("four ");
                    case 5-> System.out.print("five ");
                    case 6-> System.out.print("six ");
                    case 7-> System.out.print("seven ");
                    case 8-> System.out.print("eight ");
                    case 9-> System.out.print("nine ");
                    default -> System.out.print("zero ");

                }

                        i++;
            }
        }
        else {
            System.out.println("invalid number");
        }

    }
    public int reverse(int number){
        int reverse=0,remainder=0;
        while(number!=0){
            remainder=number%10;
            number=number/10;
            reverse=reverse*10+remainder;
        }
        return reverse;
    }


    public int getDigitCount(int number){
        int count=0 ;
        while(number!=0){
            number=number/10;
            count++;
        }
            return count;


    }


}
