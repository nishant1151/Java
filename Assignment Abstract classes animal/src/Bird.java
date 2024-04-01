public class Bird extends Animal {
   private String breed;

    Bird(String name, int age) {
        super(name, age);
    }


    @Override
    public void move() {
        System.out.println("Flying");
    }
}
