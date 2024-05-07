public class WriteMessage extends Thread{
        private Message message;

        public WriteMessage(Message message){
    this.message=message;
    }
    public void run(){

        String[] Message={
                "this is 1st message",
                "this is 2nd message",
                "this is 3rd message",
                "this is 4th message",
                "this is 5th message",
                "Finished"
        };
        for(int i=0;i< Message.length;i++){
            message.writeMessage(Message[i]);
        }
    }
}
