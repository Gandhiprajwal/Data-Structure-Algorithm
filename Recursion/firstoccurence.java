public class firstoccurence {
    static int fiind(int arr[],int key,int i ){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         return fiind(arr,key,i+1);
    }
    public static void main(String args[]){
    int arr[]={1,3,2,5,3};
        int result=fiind(arr,6,0);
        System.out.println(result);
}
}
