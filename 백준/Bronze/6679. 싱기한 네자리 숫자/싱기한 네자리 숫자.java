public class Main {
    public static void main(String[] args) {
        int index = 1000;
        while(index <= 9999) {
            if(isStrangeNum(index)) System.out.println(index);
            index++;
        }
    }
    public static boolean isStrangeNum(int num) {
        int baseDecSum = sumOfDigits(num, 10);
        int baseDuoSum = sumOfDigits(num, 12);
        int baseHexSum = sumOfDigits(num, 16);
        return (baseDecSum == baseDuoSum && baseDuoSum == baseHexSum);
    }
    public static int sumOfDigits(int num, int base) {
        int sum = 0;
        while (num > 0) {
            sum += num % base;
            num /= base;
        } return sum;
    }
}