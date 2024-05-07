public class Main {
    public static void main(String[] args){
        Message message=new Message("no message");
        WriteMessage writeMessage =new WriteMessage(message);
        ReadMessage readMessage=new ReadMessage(message);

        writeMessage.start();
        readMessage.start();
    }
}
