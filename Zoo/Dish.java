package Zoo;

public class Dish {
    private int foodIn; //еды в миске

    public Dish(int foodIn){ //создаю конструктор с едой в миске изначально
        this.foodIn=foodIn;
    }
    public void DishAmount(int foodamount) {
        foodIn+=foodamount;
    }

    public boolean DishIn(int foodEat){ //сколько съест кот){ //проверяю сколько еды в миске
        if (foodIn<foodEat){
            System.out.println("Недостаточно еды в миске для кота");
            return false;
        }
        else {
            foodIn-=foodEat;
            System.out.println("Кот съел "+ foodEat +" еды"+" осталось "+ foodIn);
            return true;
        }
    }
}

