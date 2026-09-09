import java.util.*;
class Input_Output{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks[]=new int[100];
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();

    for(int i=0;i<=2;i++){
        System.out.println(marks[i]);
    }
    float Average=((marks[0]+marks[1]+marks[2])/3);
    System.out.println("Average marks:"+Average);
    }
}