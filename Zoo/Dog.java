package Zoo;

public class Dog extends Animal {
    private static int countDog=0;
    
    public Dog (String name){
        super(name);
        countDog++;
        
    }
    @Override
    public void run(int lenght) {
        if (lenght > 500) {
            System.out.println(name  + " на такое расстояние не бегает");
            return;
        }
        super.run(lenght);
    }
    @Override
    public void swim(int lenght){
        if (lenght>10){
            System.out.println(name + " утонул");
            return;
        }
        super.swim(lenght);
    }
    public void countDog()
    {
        System.out.println("Количество собак: "+ countDog);
    }
}
