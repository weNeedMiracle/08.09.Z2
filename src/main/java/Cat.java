public class Cat extends Animal{
    int lc; //Длина когтей
    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }
}
