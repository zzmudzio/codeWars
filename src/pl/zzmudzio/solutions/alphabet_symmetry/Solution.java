package pl.zzmudzio.solutions.alphabet_symmetry;

public class Solution {
    public static int[] solve(String[] arr) { // {"abc", "ddadax", "XYY"}
        int[] resultArray = new int[arr.length];
        int counter;
        int position;
        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            position = 1;
            for (int j = 0; j < arr[i].length(); j++) {
                if(26 - (122 - (int)arr[i].toLowerCase().charAt(j)) == position) {
                    counter++;
                }
                position++;
            }
            resultArray[i] = counter;
        }
        return resultArray;
    }
}
