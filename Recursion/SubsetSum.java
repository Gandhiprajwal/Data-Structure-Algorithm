import java.util.ArrayList;

public class SubsetSum {
    public static void subset(int start,int sum,int arr[],ArrayList <Integer> listt){
        if(start==arr.length){
            listt.add(sum);
            return;
        }
        subset(start+1, sum+arr[start], arr, listt);
        subset(start+1, sum, arr, listt);

    }
    public static void main(String args[]){
        int arr[]={3,1,2};
        ArrayList <Integer> listt=new ArrayList<>();
        subset(0, 0, arr, listt);
        System.out.println(listt.toString());
    }
}
