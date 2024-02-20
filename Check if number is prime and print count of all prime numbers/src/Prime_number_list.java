public class Prime_number_list {
    public void checkPrime(int number){
        if(number>0){
        int i,count=0;
        boolean flag=false,flag1=false;

        for(i=2;i<number;i++){


            if(number%i==0){
                flag=true;
                break;
            }


        }

        if(!flag){
            System.out.println(number);
            for(i=2;i<=number;i++){
                flag1=false;
               for(int j=2;j<i;j++){
                   if(i%j==0){

                       flag1=true;
                       break;
                   }

                   }
        if(!flag1){

                count++;
            }
            }
        }
        System.out.println(count);

    }
    else{
        System.out.println("invalid input");
    }}
}