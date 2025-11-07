package Unit4;

public class ForPractice {
    public static void main(String[] args) {
        //print 5 even integers
        System.out.print("Evens:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(" " + (2 * i));
        }

        //calculate a sum of arithmetic series 1+3+5+7+9
        int sum = 0;
        for (int i = 1; i <=5; i++) {
            sum += (2 * i - 1);
        }
        System.out.println("\n" + sum);

        String text = "abcdefghggg";
        //count how many g's we have
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i,i+1).equals("g")) {
                counter ++;
            }
        }
        System.out.println("We have " + counter + " g's");

        //print each 4th character of ABCDEFGHIJKLMN
        //i++ => i = i + 1
        //i+=3 => i = i + 3
        String str = "ABCDEFGHIJKLMN";
        for (int i = 3; i < str.length(); i += 4){
            System.out.println(str.substring(i,i+1));
        }

        //reverse
        String str1 = "ABCD"; //length is 4, last index is 3
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.substring(i, i+1);
        }
        System.out.println(reversed);


        //nested loops
        for (int row = 1; row <= 5; row++) {
            String line = "";
            for (int column = 1; column <= row; column ++) {
                System.out.print("*");
            }//inner loop: printing stars
            System.out.println();
        }
    }
}