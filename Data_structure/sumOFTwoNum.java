package Data_structure;

public class sumOFTwoNum {
    public static void main(String[] args) {
        int [] number = {1,3,4,5,6,7,9};
        int counter = 0;
        for (int i = 0; i < number.length; i++) {
            int first = number[i];
        for (int j = i+1; j < number.length; j++) {
            int second = number[j];
        
            if(first+second==6){
            counter++;
        
        }  
    }  
        }
        System.out.println("The combination of the number is "+counter);
    }
}
