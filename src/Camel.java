public class Camel extends Animal {
    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Grunt");
    }
}
