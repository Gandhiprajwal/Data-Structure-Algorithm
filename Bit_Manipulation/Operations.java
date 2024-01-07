public class Operations {
    public static int ithbit(int num, int i){
        int bitMask = 1<<i;
        if((num&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIth(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        // System.out.println(ithbit(5, 2));
        System.out.println(setIth(10, 2));
    }
}
