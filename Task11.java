import java.util.Arrays;
public class Task11 {
    public static void main(String[] args) {
        array();
    }
    public static void array() {
        int [] arr = new int[100];
        for (int i=0; i<arr.length; i++) {
            arr[i]=i+1;
        }
    System.out.print(Arrays.toString(arr));
    }
}