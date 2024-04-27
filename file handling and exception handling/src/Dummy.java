import java.io.Closeable;

public class Dummy  implements Closeable {
public void close(){
    System.out.println("called");

}
}
