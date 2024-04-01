public abstract class Animal {
    protected int age;

    protected String name;

    Animal(String name,int age){
        this.age=age;
        this.name=name;

    }
    public abstract void move();

    public boolean eating(){
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
