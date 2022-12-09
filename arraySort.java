

public class arraySort {
public static void main(String[] args) {
    // bubble sorting 
    int [] array = {12,3,2};
    for (int i = 0; i < array.length-1; i++) {
        for (int j = 0; j < array.length-1-i; j++) {
            if(array[j]>array[j+1]){
                int tem = array[j];
                array[j]=array[j+1];
            array[j+1]=tem;
        tem= array[j] ;    
        }
               }
    }
    for(int k=0;k<array.length;k++){
        System.out.println(array[k]);
    }
}    
}
