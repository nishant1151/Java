public class Main {
    public static void main(String [] args){
        call(new Fish("abcd",5));
    }
    public static void call(Animal animal){
      animal.move();
        System.out.println(animal.toString());
        System.out.println(animal.eating());
    };
}