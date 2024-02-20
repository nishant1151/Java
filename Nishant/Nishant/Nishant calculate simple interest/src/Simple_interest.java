public record Simple_interest( int rate_of_interest) {
    public int calculateRateOfInterest(int principle,int time){
        return (principle*rate_of_interest*time)/100;

    }
}
