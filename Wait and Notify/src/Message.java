public class Message {
    private  String message;
    private boolean isEmpty=true;

    public Message(String message){
        this.message=message;
    }
    public synchronized void writeMessage(String message){
        if(!isEmpty){
           try{
               wait();
           }
           catch(InterruptedException e){
               e.printStackTrace();
           }
           catch (Exception e){
               e.printStackTrace();
           }
        }
        this.message=message;
        isEmpty=false;
        this.notify();
    }

    public synchronized String readMessage(){
        if(isEmpty){
            System.out.println("hello");
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        notify();
        this.isEmpty=true;

        return message;

    }
}
