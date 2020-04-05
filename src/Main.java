import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
        int [] a = {84, 69, 76, 86, 94, 91};
        bubbleSort(a);
    }

    public static void bubbleSort (int[] arr) {
        while(!arrayInOrder(arr)){
            int counter = 1;
            for(int i = 0; i < arr.length-1; i++){
                for(int j = 0; j < arr.length-1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int save = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = save;
                    }
                }
                System.out.println("Pass " + counter + ": " + Arrays.toString(arr));
                counter++;
            }
        }
    }

    public static boolean arrayInOrder (int[] arr) {
        int counter = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]) {
                    counter++;
            }
        }
        if(counter == arr.length - 1){
            return true;
        }
        return false;
    }

    public static String evenBeforeOdd(int [] arr) {
        int[] arr1 = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[counter] = arr[i];
                counter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr1[counter] = arr[i];
                counter++;
            }
        }
        return Arrays.toString(arr1);
    }

    public static int minGap (int [] a) {
        if (a.length < 2) {
            return 0;
        }
        int x = a[1]-a[0];
        for (int i = 1; i < a.length-2; i++) {
            if ((a[i + 1] - a[i]) < x) {
                x = a[i + 1] - a[i];
            }
        }
        return x;
    }

    public static String wordStats (Scanner n){
        int counter = 0;
        double length = 0;
        while(n.hasNext()){
            int x = n.next().length();
            counter++;
            length = length + x;
        }
        return "Total Words: " + counter + "\n" + " Average Length: " + (length/counter);
    }

    public static boolean dominant (int one, int two, int three) {
        if ((one + two < three) || (one + three < two) || (three + two < one)) {
            return true;
        } else {
            return false;
        }
    }






    public static void sequenceSum(double sumAmount){//unnecessary plus sign
        double counter = 0;
        double x = 1;
        String output = "";
        while(counter < sumAmount) {
            if (sumAmount != 1) {
                counter = ((1 / x) + (1 / (x + 1)) + counter);
                output += ("1/" + x + " +" + " 1/" + (x + 1) + " + ");
                x += 2;
            }
            else{
                output = "1";
                counter = 1;
            }
        }

        if(output.indexOf(" + ", output.length()-4)!=0)
        {
            output = output.substring(1, output.length()-3);
        }
        System.out.print(output);
        System.out.print(" = ");
        System.out.format( " "+ "%.3f", counter);
    }

    public static void favoriteLetter(Scanner n, String x){ //does not work if they are separate from each other
        int counter = 0;
        ArrayList<String> words = new ArrayList<String>();
        boolean quit = false;
        while(!quit){
            System.out.println("Type a word: ");
            String next = n.next();

            words.add(next);
            if (next.startsWith(x)) {
                counter++;
            }

            if (counter == 2) {
                int lastItem = words.size();
                String firstWord = words.get(lastItem-1);
                String secondWord = words.get(lastItem-2);
                if(firstWord.startsWith(x) && secondWord.startsWith(x)) {
                    quit=true;
                }
                else
                {
                    counter=0;
                }
            }
        }

        if(quit) {
            System.out.println("Found 2 sequence of words starts with " + x);
        }

    }

    public static boolean hasMidpoint (int low, int mid, int high){
        if((mid - low) == (high - mid)){
            return true;
        }
        else{
            return false;
        }
    }
}
