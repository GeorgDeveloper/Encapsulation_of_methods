public class Donkey extends Animal {
    public Donkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Hee-haw");
    }
}
