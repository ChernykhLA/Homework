import java.util.Arrays;
public class Task13 {
    public static void main(String[] args) {
        array();
    }
    public static void array() {
        int [][] table = new int [10][10];
        for (int i=0; i<10; i++) { 
            for (int j=0; j<10; j++) {
                if(i==j){
                    table[i][j]=1;
                }
                System.out.print(table[i][j] + " ");
                
            }
            System.out.println();
    }
        
    }
}
