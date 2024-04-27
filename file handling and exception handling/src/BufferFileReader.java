import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BufferFileReader {
    public static void main(String[] args){

        Path folder= Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
        Path file=Paths.get(folder+"\\mytextfile.txt");


        try(FileReader fileReader=new FileReader(file.toFile());

            BufferedReader bufferedReader=new BufferedReader(fileReader);
            Dummy dummy=new Dummy()){
            if(!Files.exists(file)){
                throw new MyFileNotFoundException("My file not found");
            }
            String str=null;
            while((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }

        }catch(IOException e){
            e.printStackTrace();
        }catch(MyFileNotFoundException e){
            e.printStackTrace();

        }catch(Exception e){
            e.printStackTrace();
        }
//        somfun(new Object());

    }


    public static <T> void fun(List<? extends BufferFileReader> l1){
        System.out.println("hello");
    }

    public static <T> void somfun(List<T> l1){
        System.out.println("hello");

    }
}
