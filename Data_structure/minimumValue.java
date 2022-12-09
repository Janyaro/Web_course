package Data_structure;

public class minimumValue {
    public static void minimum(int [] arr) {


    }
    public static void main(String[] args) {
        int [] arr = {2,3,45,7,8,6,1};
        int min=arr[0];
        for (int i = 0; i < 7;i++) {
            if(arr[i]<min)
                min=arr[i];
                
        }
            System.out.println("The minimum number is "+ min);
            return;      
 }
}
