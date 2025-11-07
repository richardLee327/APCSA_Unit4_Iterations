package Labs;

import java.util.Scanner;

public class ForLoopLab {
    public static void main(String[] args) {
        for (int i = 4; i <=7; i++){ //print from 4 and stop before 8
            System.out.println(i);
        }
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + " "); //counting down
        }

        //counting letter "e"
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a word here: ");
        String str = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            String letter = str.substring(i,i+1);
            if (letter.equals("e")) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " e's in the given word");

        //printing downward ladder
        int height = 5;
        for (int row = height; row >= 1; row--) {
            String line = "";
            for (int star = row; star >= 1; star--) {
                line += "*";
            }
            System.out.println(line);
        }


        System.out.println();
        //printing pyramid
        int h = 4;
        for (int row = 1; row <= h; row++) {
            String l = "";
            for (int column = 1; column <= row; column ++) {
                l += "*";
            }
            System.out.println(l);
        }
        for (int row = h-1; row >= 1; row--) {
            String l = "";
            for (int column = row; column >=1; column--) {
                l += "*";
            }
            System.out.println(l);
        }
    }
}

/*
1. We use i < word.length() because java's index starts with 0. if i == word.length(),
the range will be out of bound.
2. In the ladder, we want the inner loop to run "row" times because we want the number
of stars to correspond to the current height of the row.
3. For loop is sometimes better than a while loop because it is shorter more concise.
It also reduces the risk of infinite loops as for loops are definite loops where you
already know the iteration times beforehand.
 */