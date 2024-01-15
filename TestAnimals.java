public class TestAnimals {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        d.run(500);
        c.run(200);
        d.swim(5);
        c.swim(5);
        d.jump(0.5f);
        c.jump(2f);
    }
}