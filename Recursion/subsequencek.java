import java.util.ArrayList;

public class subsequencek {
    public static void finder(ArrayList <Integer> store,int arr[],int n,int sum,int value){
        if(n==arr.length){
            if(sum==value){
                System.out.println(store.toString());
            }
           return;
        }
        store.add(arr[n]);
        sum+=arr[n];
        finder(store, arr, n+1, sum, value);
        store.remove(store.size()-1);
        sum-=arr[n];
        finder(store, arr, n+1, sum, value);
    }
    public static boolean finderr(ArrayList <Integer> store,int arr[],int n,int sum,int value){
        if(n==arr.length){
            if(sum==value){
                System.out.println(store.toString());
                return true;
            }
           return false;
        }
        store.add(arr[n]);
        sum+=arr[n];
        if(finderr(store, arr, n+1, sum, value)==true){
            return true;
        }
        store.remove(store.size()-1);
        sum-=arr[n];
        if(finderr(store, arr, n+1, sum, value)==true){
            return true;
        }
        else{
            return false;
        }
    }
     public static int  finderrr(int arr[],int n,int sum,int value){
        if(n==arr.length){
            if(sum==value){
                
                 return 1;
            }
            return 0;
          
        }
        
        sum+=arr[n];
        int l=finderrr(arr, n+1, sum, value);
       
        sum-=arr[n];
        int m=finderrr( arr, n+1, sum, value);
        return l+m;
    }
    public static void main(String args[]){
        int arr[]={1,2,1};
        finder(new ArrayList<Integer>(), arr, 0, 0, 2);
        finderr(new ArrayList<Integer>(), arr, 0, 0, 2);
        int result=finderrr(arr, 0, 0, 2);
        System.out.println(result);
    }
}
