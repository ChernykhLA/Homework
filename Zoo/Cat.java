package Zoo;

public class Cat extends Animal  {
    private static int countCat=0;
    private boolean satiety=false;
    private int amountfood;
    public Cat (String name, int amountfood){
        super(name);
        countCat++;
        this.amountfood=amountfood;
    }
    @Override
    public void run(int lenght) {
        if (lenght > 200) {
            System.out.println(name +" на такое расстояние не бегает");
            return;
        }
        super.run(lenght);
    }

    @Override
    public void swim (int lenght) {
        System.out.println(name + " утонул");
        super.swim(lenght);
    }

    public void countCat()
    {
        System.out.println("Количество котов: "+ countCat);
    }

    public void catEat(Dish dish){
        if (dish.DishIn(amountfood)) {
            satiety = true;
        } else {
            satiety = false;
        }
    }

    public void checkSatiety(){
        if (satiety==true){
            System.out.println(name+ " сыт");
        } else {
            System.out.println(name+" не сыт");
        }
    }
}
