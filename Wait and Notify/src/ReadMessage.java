public class ReadMessage extends Thread{
    private Message message;


    public ReadMessage(Message message){
        this.message=message;
    }
    public void run(){
        int i=0;
        do{
            System.out.println(message.readMessage());
        }while(!message.readMessage().equals("Finished"));
    }
}
