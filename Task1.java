public class Task1{
    public static void main (String[] args){

        // System.out.println(convert(5));
        // System.out.println(convert(3));
        // System.out.println(convert(8));

        // System.out.println(fitCalc(15, 1));
        // System.out.println(fitCalc(24, 2));
        // System.out.println(fitCalc(41, 3));

        // System.out.println(containers(3, 4, 2));
        // System.out.println(containers(5, 0, 2));
        // System.out.println(containers(4, 1, 4));
        
        // System.out.println(triangleType(5, 5, 5));
        // System.out.println(triangleType(5, 4, 5));
        // System.out.println(triangleType(3, 4, 5));
        // System.out.println(triangleType(5, 1, 1));

        // System.out.println(ternaryEvaluation(8, 4));
        // System.out.println(ternaryEvaluation(1, 11));
        // System.out.println(ternaryEvaluation(5, 9));

        // System.out.println(howManyItems(22, 1.4, 2));
        // System.out.println(howManyItems(45, 1.8, 1.9));
        // System.out.println(howManyItems(100, 2, 2));

        // System.out.println(factorial(3));
        // System.out.println(factorial(5));
        // System.out.println(factorial(7));

        // System.out.println(gcd(48, 18));
        // System.out.println(gcd(52, 8));
        // System.out.println(gcd(259, 28));

        // System.out.println(ticketSaler(70, 1500));
        // System.out.println(ticketSaler(24, 950));
        // System.out.println(ticketSaler(53, 1250));

        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }

    public static double convert (int gallons){
        return gallons * 3.785;
    }

    public static int fitCalc (int minuts, int intensity){
        return minuts * intensity;
    }

    public static int containers (int box, int bag, int barrel){
        return box * 20 + bag * 50 + barrel * 100;
    }

    public static String triangleType (int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a){
            if (a == b & b == c){
                return "isosceles";
            }
            else if (a != b & a != c & b != c){
                return "different-sided";
            }
            else {
                return "equilateral";
            }
        }
        else {
            return "not a triangle";
        }
    }

    public static int ternaryEvaluation (int a, int b){
        return a > b ? a : b;
    }

    public static int howManyItems (double n, double w, double h){
        return (int) (n / 2 / w / h);
    }

    public static int factorial (int n){
        int result = 1;
        for (int i = 1; i < n + 1; i++){
            result *= i;
        }
        return result;
    }

    public static int gcd (int a, int b){
        if (a == b){
            return a;
        }
        if (a < 0 || b < 0){
            return 0;
        }
        while (a != 0 && b != 0){
            if (a > b){
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static int ticketSaler(int count, int cost){
        return (int) (count * cost * 0.72);
    }

    public static int tables(int students, int c_tables){
        if (c_tables * 2 > students){
            return 0;
        }
        int paucity = students % (c_tables * 2);
        if (paucity % 2 == 0){
            return paucity / 2;
        }
        else {
            return (paucity + 1) / 2;
        }
    }
}