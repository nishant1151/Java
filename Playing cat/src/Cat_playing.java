public class Cat_playing {
    public boolean isCatPlaying(boolean summer, int temperature){
        return(summer && temperature>25 && temperature<45) || (summer!=true && temperature>25 && temperature<35);


    }
}
