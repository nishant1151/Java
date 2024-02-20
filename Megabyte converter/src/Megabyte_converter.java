public class Megabyte_converter {
    public void printMegeByteAndkiloBytes(int kilobytes){
        int remainder,megabyte;
        if(kilobytes>0){
            remainder=kilobytes%1024;
            megabyte=kilobytes/1024;
            System.out.println(kilobytes+" kb="+megabyte+" MB and "+remainder+" kb");
        }
        else {
            System.out.println("Invalid value");
        }
    }
}
