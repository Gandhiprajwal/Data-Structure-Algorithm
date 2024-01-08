public class Operations {
    public static int getIthbit(int num, int i){
        int bitMask = 1<<i;
        if((num&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthbit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthbit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthbit(int n,int i, int newBit){
        // if(newBit == 0){
        //     return clearIthbit(n, i);
        // }
        // else{
        //     return setIthbit(n, i);
        // }

        n = clearIthbit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearIbits(int n, int i){
        int bitMask = ~0<<i;
        return n & bitMask;
    }
    public static int clearRangebits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        // System.out.println(ithbit(5, 2));
        // System.out.println(setIthbit(10, 2));
        // System.out.println(clearIthbit(10, 1));
        // System.out.println(updateIthbit(10, 2, 1));
        // System.out.println(clearIbits(15, 2));
        System.out.println(clearRangebits(10, 2,4));
    }
}
