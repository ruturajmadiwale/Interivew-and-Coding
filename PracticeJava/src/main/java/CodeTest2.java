import java.util.ArrayList;
import java.util.List;

public class CodeTest2 {

    public static String duplicate(char[] c) {
        String dupliateChars = "";
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j] & i != j & !dupliateChars.contains("" + c[i])) {
                    dupliateChars += c[i];
                }
            }
        }
        return dupliateChars;
    }

    public static String uniqueWithNoduplicate(char[] c) {
        String uniqueChars = "";
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] != c[j] & i != j & !uniqueChars.contains("" + c[i])) {
                    uniqueChars += c[i];
                }
            }
        }
        return uniqueChars;
    }

    public static String onlyUnique(char[] c) {
        String uniqueChars = "";
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j] & i != j) {
                    count++;

                }
            }
            if (count == 0) {
                uniqueChars += c[i];
            }
        }
        return uniqueChars;
    }

    public static void uniqueWithNoduplicateWithCount(char[] c) {
        String uniqueChars = "";
        //List<Character,Integer> ll = new ArrayList<>();
        Object[][] ob = new Object[c.length][c.length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] != c[j] & i != j & !uniqueChars.contains("" + c[i])) {
                    uniqueChars += c[i];
                }
            }
        }
        for (int z = 0; z < uniqueChars.length(); z++) {
            int count = 0;
            for (int k = 0; k < c.length; k++) {
                if (uniqueChars.charAt(z) == c[k])
                    count++;
            }
            System.out.print(uniqueChars.charAt(z) + " :" + count + ", ");
        }

    }

    public static void main(String[] args) {

        String s = "heellohelab";
        char[] c = s.toCharArray();

        System.out.println("Duplicate:" + duplicate(c));
        System.out.println("UniqueWithNoDuplicate:" + uniqueWithNoduplicate(c));
        System.out.println("OnlyUnique:" + onlyUnique(c));
        uniqueWithNoduplicateWithCount(c);

    }
}
