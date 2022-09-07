public class Horse extends Animal{
    int m; //Масса переносимого лошадью груза
    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржот");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест сено");
    }
}
