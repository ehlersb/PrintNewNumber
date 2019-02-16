import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 2/16/2019.
 */
public class Main {
    public static void main(String[] args) {
        String input;
        System.out.println("Type in a number to have another number generated. ");
        System.out.println("Enter '!' to quit.");
        while(true) {
            Scanner scanWord = new Scanner(System.in);
            input = scanWord.nextLine();
            if(input.equals("!")) break;
            System.out.println(newNumber(Integer.parseInt(input)));
        }
    }

    private static long newNumber(long num) {
        long numDigits = numDigits(num);

    }

    private static long numDigits(long num) {
        long i = 1;
        long moddedNum = num % ((10)^i);
        while(moddedNum != num) {
            i++;
            moddedNum = num % ((10)^i);
        }
    }


}
