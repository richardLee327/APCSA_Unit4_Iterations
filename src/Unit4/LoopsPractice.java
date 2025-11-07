package Unit4;

public class LoopsPractice {
    public static void main(String[] args) {
        //sum of integers from 1 to 100
        System.out.println(sum(1,100));
        System.out.println(divisible(1,20)); //5
        System.out.println(extractingDigits(1234,3));
        System.out.println(sumOfDigits(123));
    }

    //write a function that calculates a sum of all digits ina given number
    public static int sumOfDigits (int x) {
        int sum = 0;
        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        return sum;
    }

    public static int extractingDigits (int number, int whichLast) {
        int times = 1;
        int lastDigit = 0;
        while (times <= whichLast) {
            lastDigit = number % 10;
            number /= 10;
            times ++;
        }
        return lastDigit;
    }

    public static int sum (int first, int last) { //or you can just throw away number and update first
        int sum = 0;
        int number = first;
        while (number <= last) {
            sum += number;
            number ++;
        }
        return sum;
    }

    //how many numbers are divisible by 3, but not divisible by 5, between and last
    public static int divisible (int first, int last) {
        int count = 0;
        int number = first;
        while (number <= last) {
            if (number % 3 ==0 && number % 5 != 0) {
                count +=1;
            }
            number++;
        }
        return count;
    }



}
