package Homework_18_03_2019;

public class Task3 {
    public static void main(String[] args) {
        byte numberByte = -25;
        short numberShort = 5400;
        int numberInt = 2000000;
        long numberLong = 156325448266L;
        int byteCount = bitCalculator(numberByte);
        System.out.println("Bit quantity in byte number " + numberByte + " is " + byteCount);
        int shortCount = bitCalculator(numberShort);
        System.out.println("Bit quantity in short number " + numberShort + " is " + shortCount);
        int intCount = bitCalculator(numberInt);
        System.out.println("Bit quantity in int number " + numberInt + " is " + intCount);
        int longCount = bitCalculator(numberLong);
        System.out.println("Bit quantity in long number " + numberLong + " is " + longCount);
    }

    private static int bitCalculator (byte number) {
        int count = 0;
        if (number<0) {
            return 32;
        }
        while(number!= 0) {
            number = (byte) (number >>> 1);
            count ++;
        }
        return count;
    }
    private static int bitCalculator (short number) {
        int count = 0;
        if (number<0) {
            return 32;
        }
        while(number!=0) {
            number = (short) (number >>> 1);
            count ++;
        }
        return count;
    }
    private static int bitCalculator (int number) {
        int count = 0;
        while(number!=0) {
            number = number >>> 1;
            count ++;
        }
        return count;
    }

    private static int bitCalculator (long number) {
        int count = 0;
        while(number!=0) {
            number = number >>> 1;
            count ++;
        }
        return count;
    }
}
