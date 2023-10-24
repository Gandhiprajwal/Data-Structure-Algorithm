public class Xpowern {
    public int npower(int a,int n){
        if(n==1){
            return a;
        }
        int endno=npower(a, n/2)*npower(a,n/2);
        if(n%2!=0){
            endno=a*endno;
        }
        return endno;
    } 
    public static void main(String args[]){
        Xpowern n= new Xpowern();
        System.out.println(n.npower(2, 11));
    }
    
}
