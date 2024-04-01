public class Fish extends Animal {
   private String breed;

    Fish(String name, int age) {
        super(name, age);
    }


    @Override
    public void move() {
        System.out.println("swimming");
    }
}
