public class Flourtopack {
        public boolean canPack(int bigCount ,int smallCount,int goal){
    int totalCount=(bigCount*5)+smallCount;
            if(totalCount>=goal){

                if((bigCount*5)%5==0 && smallCount%goal==0)
                {
                    return true;
                }
                else return false;
            }
            else return false;
        }
}
