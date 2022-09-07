public class Main {
    public static void main(String[] args) {
    Veterinar v1 = new Veterinar();
    Dog d1 = new Dog();
    d1.food = "Мясо";
    d1.location = "Деревня";
    d1.prof = "Пастух";
    Cat c1 = new Cat();
    c1.food = "Рыба";
    c1.location = "Дом";
    c1.lc = 2;
    Horse h1 = new Horse();
    h1.food = "Сено";
    h1.location = "Ферма";
    h1.m = 50;
    Animal[] zver = {d1, c1, h1};
    for(int i = 0; i<zver.length; i++){
        v1.treatAnimal(zver[i]);
    }
    }
}
