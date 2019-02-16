import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 2/16/2019.
 */
public class Main {
    public static void main(String[] args) {
        String input;
        System.out.println("Type in a number (up to 10 digits, inclusive) to have another number generated. ");
        System.out.println("Enter '!' to quit.");
        while(true) {
            Scanner scanWord = new Scanner(System.in);
            input = scanWord.nextLine();
            if(input.equals("!")) break;
            System.out.println(newNumber(Integer.parseInt(input)));
        }
    }

    private static long newNumber(long num) {
        long numDigits = num > 0 ? Math.round(Math.floor(Math.log10(num)) + 1) : 1;
        long numNewDigits = 0;
        long newNum = 0;
        long tempNum = num;
        for(long i = 1; i < numDigits + numNewDigits + 1; i++) {

            if(tempNum % (long) Math.pow(10, i - numNewDigits) ==  (9 * (long) Math.pow(10, (i - 1) - numNewDigits))) {
                numNewDigits++;
                i++;
                newNum += ((long) Math.pow(10, i - 1 ));
                tempNum -= (tempNum % ((long) Math.pow(10, (i - 1) - (numNewDigits - 1))));
            }
            else {
                long numToAdd = (((tempNum % ((long) Math.pow(10, i))) * (long) Math.pow(10, numNewDigits)) + (long) (1 * Math.pow(10, (i - 1))));
                newNum += numToAdd;
                long numToSub = (tempNum % ((long) Math.pow(10, i)));
                tempNum -= numToSub;
            }

        }
        return newNum;
    }

}
