package Zoo;

public class Main {
    
    public static void main(String[] args) {
        Animal animal = new Animal("Luck");
        Animal animal1 = new Animal ("Farf");
        animal.run(120);
        animal.swim(120);
        animal1.run(230);
        Cat cat = new Cat("Murzik",12);
        Cat cat1 = new Cat ("Gashish",17);
        Dog dog = new Dog("Sharik");
        cat.run(100);
        cat.run(20000);
        cat1.run(200);
        dog.run(350);
        dog.swim(13);
        animal.countAnimals();
        cat.countCat();
        dog.countDog();
        Dish dish=new Dish(25);//сколько в миске еды
        cat.catEat(dish);
        cat.checkSatiety(); //сколько съел кот
        cat1.catEat(dish);
        cat1.checkSatiety();
        array();
    }

    public static void array() {
        Cat [] arr = {new Cat("cat1", 19), new Cat("cat2", 14), new Cat("cat3", 10)};
        Dish dish = new Dish(40);
        for (int i=0; i<arr.length; i++) {
            arr[i].catEat(dish);
        }
        for (int i=0; i<arr.length; i++){
            arr[i].checkSatiety();  
        }
    }
}
