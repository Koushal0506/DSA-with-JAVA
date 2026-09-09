class Call_By_Reference{
    public static void Changable(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    
    public static void main(String[] args) {
        int marks[]={97,98,99};
        Changable(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(" "+marks[i]);
        }
        System.out.println();
    }
}