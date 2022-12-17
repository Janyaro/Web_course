import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int [] num = {1,2,4,5,6};
        int [] newArray = new int [num.length+1];
int element =3;
// int position=3;
// int position = num.length;
        for (int i = 0; i < num.length+1; i++) {
            if(i==0){
                newArray[i]=element;
            }
            if (i>0) {
                newArray[i]=num[i-1];
            }
        }
        for (int j =0;j<num.length+1;j++) {
            System.out.println(newArray[j]);    
        }
        // end 
        // for(int x=0;x<newArray.length;x++){
        //     if(x==num.length){
        //     newArray[newArray.length-1]=element;
        //     }
        //     else{
        //         newArray[x]=num[x];
        //     }
        // }
        // for (int j =0;j<num.length+1;j++) {
        //         System.out.println(newArray[j]);    
        //     }
        // 
//         for (int i = 0; i < num.length; i++) {
//             if(i<position){
//                 newArray[i]=num[i];
//             }
//              if(i==position){
//                 newArray[i]=element;
//             }
            
//                 newArray[i+1]=num[i];
            
//         }
//  for (int j =0;j<newArray.length;j++) {
//                 System.out.println(newArray[j]);    
//             }
  
    }
}