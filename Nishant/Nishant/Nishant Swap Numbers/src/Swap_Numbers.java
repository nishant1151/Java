public record Swap_Numbers(){
    public void swapNumbers(int number1,int number2){
        int temp;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("Number1="+number1+" Number2="+number2);
    }
}
