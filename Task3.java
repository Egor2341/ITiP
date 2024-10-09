import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));

        ArrayList<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"Laptop", 124200});
        data.add(new Object[]{"Phone", 51450});
        data.add(new Object[]{"Headphones", 13800});
        ArrayList<Object[]> result = sale(data, 25);
        for (Object[] element : result){
            System.out.println(Arrays.toString(element));
        }

        System.out.println(sucsessShoot(0, 0, 5, 2, 2));
        System.out.println(sucsessShoot(-2, -3, 4, 5, -6));

        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));

        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));

        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));

        System.out.println(mostExpensive(new Object[][] {new Object[] {"Скакалка", 550, 8}, new Object[] {"Шлем", 3750, 4}, new Object[] {"Мяч", 2900, 10}}));

        System.out.println(longestUnique("abcba"));
        System.out.println(longestUnique("bbb"));

        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));

        System.out.println(doesBrickFit(1, 1, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));
    }

    public static boolean isStrangePair(String s1, String s2) {
        if (s1.isEmpty()) {
            return s2.isEmpty();
        }
        return s2.startsWith(String.valueOf(s1.charAt(s1.length() - 1))) && s2.endsWith(String.valueOf(s1.charAt(0)));
    }

    public static ArrayList<Object[]> sale(ArrayList<Object[]> data, int discount) {
        ArrayList<Object[]> result = new ArrayList<Object[]>();
        for (Object[] element : data) {
            double price = (int) element[1] * (1 - discount * 0.01);
            int intPrice = (int) price;
            if (intPrice < 1) {
                intPrice = 1;
            }
            result.add(new Object[]{element[0], ((intPrice != 1 && price - intPrice >= 0.5) ? intPrice + 1 : intPrice)});
        }
        return result;
    }

    public static boolean sucsessShoot(int x, int y, int r, int m, int n) {
        return Math.sqrt(Math.pow((m - x), 2) + Math.pow((n - y), 2)) <= r;
    }

    public static boolean parityAnalysis(int n) {
        int isEven = n % 2;
        int sumNums = 0;
        while (n > 0) {
            sumNums += n % 10;
            n /= 10;
        }
        return isEven == sumNums % 2;
    }

    public static String rps(String player1, String player2) {
        HashMap<String, String> game = new HashMap<String, String>();
        game.put("rock", "scissors");
        game.put("paper", "rock");
        game.put("scissors", "paper");
        if (player1.equals(player2)) {
            return "Tie";
        }
        return (game.get(player1).equals(player2)) ? "Player 1 wins" : "Player 2 wins";
    }

    public static int bugger(int n) {
        int newN;
        int result = 0;
        while (n / 10 > 0) {
            newN = 1;
            while (n > 0) {
                newN *= n % 10;
                n /= 10;
            }
            n = newN;
            result += 1;
        }
        return result;
    }

    public static String mostExpensive(Object[][] data){
        String name = "";
        int cost = 0;
        for (Object[] element : data){
            int curCost = (int) element[1] * (int) element[2];
            if (curCost > cost){
                cost = curCost;
                name = (String) element[0];
            }
        }
        return String.format("Наиб. общ. стоимость у предмета %s - %d", name, cost);
    }

    public static String longestUnique(String s){
        char[] sArray = s.toCharArray();
        int maxLength = 0;
        String result = "";
        String curS = "";
        for (char ch : sArray){
            if (curS.indexOf(ch) == -1){
                curS += ch;
                if (curS.length() > maxLength){
                    maxLength = curS.length();
                    result = curS;
                }
                continue;
            }
            curS = curS.substring(curS.indexOf(ch) + 1) + ch;
        }
        return result;
    }

    public static boolean isPrefix(String s, String prefix){
        return s.startsWith(prefix.replace("-", ""));
    }

    public static boolean isSuffix(String s, String suffix){
        return s.endsWith(suffix.replace("-", ""));
    }

    public static boolean doesBrickFit(int a, int b, int c, int w, int h){
        int[] brick = new int[] {a, b, c};
        Arrays.sort(brick);
        return (brick[0] <= w && brick[1] <= h) || (brick[0] <= h && brick[1] <= w);
    }
}
