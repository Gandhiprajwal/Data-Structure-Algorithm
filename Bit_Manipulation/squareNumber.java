public class squareNumber {
    public static int squareNumber(int n) {
        int ans = 0;
        int temp = n;
        int pos = 0;
        while (temp > 0) {
            if ((temp & 1) > 0) {
                ans += (n << pos);
            }
            pos++;
            temp = temp>>1;
            // System.out.println(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(squareNumber(5));
    }
}
