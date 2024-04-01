public class Dog extends Animal {
   private String breed;

    Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void move() {
        System.out.println("Walk");
    }

}
