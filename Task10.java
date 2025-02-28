import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        array();
    }
    public static void array() {
        int [] arr = {0,1,1,0,1,0,0,0,1,1};
        for (int i=0; i<10; i++) {
            if (arr[i]==0){
                arr[i]=1;
            }
            else {
                arr[i]=0;
            }
            
        }
System.out.print(Arrays.toString(arr));
        
    }
}