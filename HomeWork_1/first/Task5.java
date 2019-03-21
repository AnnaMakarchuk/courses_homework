package Homework_18_03_2019;

public class Task5 {
    public static void main(String[] args) {
        int number = 55;
        int position = 2;
        int numberZeroChange = changeZeroBit(number, position);
        int numberOneChange = changeOneBit(number, position);

        System.out.println("Number " + number + " becomes " + numberZeroChange + " when changing bit at 0 on the binary" +
                " position " + position);
        System.out.println("Number " + number + " becomes " + numberOneChange + " when changing bit at 1 on the binary" +
                " position " + position);
    }

    private static int changeZeroBit(int number, int position) {
        if (((number >> position) & 1) == 1) {
            return number ^ 1 << position;
        }
        return number;
    }

    private static int changeOneBit(int number, int position) {
        return number | 1 << position;
    }
}
