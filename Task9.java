import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        printYear(y);
    }
    public static boolean printYear(int y) {
        
        if (y%100==0)  {
            if (y%400==0) {
                return true;
            }
            else{
                return false;
            }
            
        }
        else {
            if (y%4==0) {
                return true;  
            }
            else {
                return false;
            }
        }


        
    }
}
