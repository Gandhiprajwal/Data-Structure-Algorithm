

public class firstcome {
    public static int checkingnumber(int arr[],int n,int key){
        if(arr[n]==key){
            return n;
        }
        if(n==arr.length-1){
            return  -1;
        }
        return checkingnumber(arr, n+1, key);
    }
    public static void main(String args[]){
        int arr[]={1,3,2,5,2,3};
        int result=checkingnumber(arr, 0, 8);
        System.out.println(result);
    }
}
