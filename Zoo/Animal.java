package Zoo;

public class Animal {

    private static int countAnimals=0;
    String name;

    public Animal(String name){
            this.name = name;
            countAnimals++;
    }

    public void run(int lenght) {
        System.out.println(name+ " пробежал " + lenght +" м");
    }
    public void swim(int lenght) {
        System.out.println(name+ " проплыл " + lenght +" м");
    }
    public void countAnimals(){
        System.out.println("Количество животных: " +countAnimals);
    }
}
