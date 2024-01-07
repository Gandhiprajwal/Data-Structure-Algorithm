class oddEven{
    public static void main(String[] args) {
        int num = 3;
        int bitMask = 1;
        if((num & bitMask) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}