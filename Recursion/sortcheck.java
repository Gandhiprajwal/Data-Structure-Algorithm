public class sortcheck {
    static boolean check(int arr[],int start){
        if(start==arr.length-1){
            return true;
        }
        if(arr[start]>arr[start+1]){
             return false;
        }
       return check(arr,start+1);
      
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5};
       boolean h= check(arr,0);
       System.out.println(h);
    }
    
}
