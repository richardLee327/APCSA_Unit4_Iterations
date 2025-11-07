package Labs;

public class Lab1 {
    public static void main(String[] args) {
    int times = 0;
    while (times < 4) {
        if (coinToss() == 1) { //head
            System.out.print("H ");;
            times ++;
        } else {
            System.out.print("T ");
            times = 0;
        }
    }
    System.out.println();
    System.out.println("Four heads in a row!");

    }
    public static int coinToss () {
        return (int) (2 * Math.random()); //generate either 0 or 1
    }


}
