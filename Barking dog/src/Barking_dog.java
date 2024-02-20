public class Barking_dog {

    public boolean shouldWakeUp(boolean barking,int hourofday){
     if(hourofday<0 || hourofday>23){
         return false;
     }
      else  if(barking==true && (hourofday<8 || hourofday>22)){
            return true;
        }
      else{
          return false;
     }
    }
}
