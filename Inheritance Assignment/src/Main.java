public class Main {
    public static void main(String args[]){

        Salariedemployee s1=new Salariedemployee("Nishant","11-05-2001","27-02-2024",20555);
        System.out.println(s1);
        Salariedemployee s2=new Salariedemployee("Nishant","11-05-2001","27-02-2024",20555);
        System.out.println(s2);
        Salariedemployee s3=new Salariedemployee("Nishant","11-05-2001","27-02-2024",20555);
        s3.terminate("27-12-2025");
        System.out.println(s3);
        System.out.println(s3.getAge());
    }
}
