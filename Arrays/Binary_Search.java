class Binary_Search{
    public static int BinarySearch(int arr[], int key){
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Key find at Index:"+BinarySearch(arr,key));
    }
}