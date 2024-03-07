import java.net.HttpRetryException;

public class Flourtopack {
        public boolean canPack(int bigCount ,int smallCount,int goal) {

           int temp,totalCount=bigCount+smallCount;

            if(bigCount>0 && smallCount>0){

                if((bigCount*5)/goal==0){
                    temp=(bigCount*5)-goal;
                    if(smallCount%temp==0){
                    return true;}
                    else return false;
                }

            }
            return false;


        }
}
