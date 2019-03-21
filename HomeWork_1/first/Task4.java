package Homework_18_03_2019;

public class Task4 {
    public static void main(String[] args) {
        int a = 35;
        int b = 15;
        System.out.println(binaryAlgorithm(a,b));
    }

    private static int binaryAlgorithm (int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b){
            return a;
        }
        if (a == 1 || b == 1){
            return 1;
        }
        if (((a & 1) != 0) && ((b & 1) != 0) && a > b) {
            return binaryAlgorithm(a-b , b);
        }
        if (((a & 1) != 0) && ((b & 1) != 0) && a < b) {
            return binaryAlgorithm(b -a , a);
        }
        if ((a & 1) == 0) {
            return ((b & 1) == 0) ? binaryAlgorithm(a >> 1, b >> 1) << 1 : binaryAlgorithm(a>>1, b);
        } else {
            return ((b & 1) == 0) ? binaryAlgorithm(a, b >> 1) : binaryAlgorithm(a, b);
        }
    }
}
