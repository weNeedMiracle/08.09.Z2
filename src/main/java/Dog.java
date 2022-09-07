public class Dog extends Animal{
    String prof;//Профессия
    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест мясо");
    }
}
