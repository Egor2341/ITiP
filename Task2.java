import javax.swing.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

//        System.out.println(duplicateChars("Barack", "Obama"));
//        int[] nums = new int[]  {3, 12, 7, 81, 52};
//        System.out.println(dividedByThree(nums));
//        System.out.println(getInitials("simonov sergei evgenievich"));
//        System.out.println(getInitials("kozhevnikova tatiana vitalevna"));
//        double[] nums = new double[]  {3.5, 7.0, 1.5, 9.0, 5.5};
//        System.out.println(Arrays.toString(normalizator(nums)));
//        nums = new double[]  {10.0, 10.0, 10.0, 10.0};
//        System.out.println(Arrays.toString(normalizator(nums)));
//        double[] nums = new double[]  {1.6, 0, 212.3, 34.8, 0, 27.5};
//        System.out.println(Arrays.toString(compressedNums(nums)));
//        System.out.println(camelToSnake("helloWorld"));
//        int[] nums = new int[]  {3, 5, 8, 1, 2, 4};
//        System.out.println(secondBiggest(nums));
//        System.out.println(localReverse("baobab", 'b'));
//        System.out.println(localReverse("Hello, I’m under the water, please help me", 'e'));
//        System.out.println(equal(8, 1, 8));
//        System.out.println(equal(5, 5, 5));
//        System.out.println(equal(4, 9, 6));
//        System.out.println(isAnagram("LISTEN", "silent"));
//        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!"));
//        System.out.println(isAnagram("hello", "world"));

    }

    public static String duplicateChars(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            char letter = str1.charAt(i);
            if (str1.indexOf(letter, i + 1) == -1 && str2.indexOf(letter) == -1) {
                result.append(letter);
            }
        }
        return result.toString();
    }

    public static int dividedByThree(int[] nums) {
        int result = 0;
        for (int i : nums) {
            if (i % 2 != 0 && i % 3 == 0) {
                result += 1;
            }
        }
        return result;
    }

    public static String getInitials(String name) {
        String[] splitName = name.split(" ");
        return String.valueOf(Character.toUpperCase(splitName[1].charAt(0))) + "." +
                Character.toUpperCase(splitName[2].charAt(0)) + ". " +
                Character.toUpperCase(splitName[0].charAt(0)) + splitName[0].substring(1);
    }

    public static double[] normalizator(double[] nums) {
        double[] sortNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortNums);
        double[] result = new double[nums.length];
        if (sortNums[nums.length - 1] - sortNums[0] == 0) {
            Arrays.fill(result, 0.0);
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = (nums[i] - sortNums[0]) / (sortNums[nums.length - 1] - sortNums[0]);
        }
        return result;
    }

    public static int[] compressedNums(double[] nums){
        int countZeroz = 0;
        for (double n : nums){
            if (n == 0){
                countZeroz += 1;
            }
        }
        int[] result = new int[nums.length - countZeroz];
        int i = 0;
        for (double n : nums){
            if (n != 0){
                result[i] = (int) n;
                i += 1;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public static String camelToSnake(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (Character.toLowerCase(letter) != letter) {
                result.append("_").append(Character.toLowerCase(letter));
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }

    public static int secondBiggest(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return nums[nums.length - 2];
    }

    public static String localReverse(String s, char marker) {
        String[] splitS;
        String tail = "";
        int countMarkers = s.length() - s.replace(String.valueOf(marker), "").length();
        if (countMarkers % 2 != 0){
            splitS = s.substring(0, s.lastIndexOf(marker)).split(String.valueOf(marker));
            tail = s.substring(s.lastIndexOf(marker));
        }
        else {
            splitS = s.split(String.valueOf(marker));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < splitS.length; i++) {
            if (i % 2 != 0 ){
                result.append(marker).append(new StringBuilder(splitS[i]).reverse()).append(marker);
            }
            else {
                result.append(splitS[i]);
            }
        }
        result.append(tail);
        return result.toString();
    }

    public static int equal(int a, int b, int c){
        int[] nums = new int[] {a, b, c};
        Arrays.sort(nums);
        if (nums[0] == nums[2]){
            return 3;
        }
        else if (nums[0] == nums[1] || nums[1] == nums[2]){
            return 2;
        }
        else {
            return 0;
        }
    }

    public static boolean isAnagram(String s1, String s2){
        s1 = delSpecSymbols(s1);
        s2 = delSpecSymbols(s2);
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);

    }

    private static String delSpecSymbols(String s){

        for (int i = 0; i < s.length(); i++){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                s = s.replace(String.valueOf(s.charAt(i)), "");
            }
        }

        return s;


    }
}
