public class Primes {
    public static void main (String[] args) {
        for (int i = 2; i<101; i++){
            if (isPrime(i)){
                System.out.print(i+" ");  
            }
        }
    }

    public static boolean isPrime (int n) {
        int[] nums = new int[] { 2, 3, 5, 7 };
        for (int i : nums){
            if (n!=i && n % i == 0){
                return false;
            }
        }
        return true;
    }
}