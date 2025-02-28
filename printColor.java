public class printColor {
    public static void main(String[] args) {
        сolor();
    }
    public static void сolor(){
        int value =1000;
        if (value<=0) {
            System.out.println("Красный");
        } else { 
            if (value<=100)
                System.out.println("Желтый");
             else {
                System.out.println("Зеленый");
             }
        }
    }
}
