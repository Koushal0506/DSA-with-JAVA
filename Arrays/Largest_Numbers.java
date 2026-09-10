
import java.util.*;
class Largest_Numbers{
    public static int Largest_num(int numbers[]){
        int Largest= Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>Largest){
                Largest=numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest Number in Array is:"+Largest_num(numbers));
        
    }
}