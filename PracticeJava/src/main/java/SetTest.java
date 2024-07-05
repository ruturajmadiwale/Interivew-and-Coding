import java.util.*;

public class SetTest {

    public static void main(String[] args) {

        Set s = new HashSet();
        s.add(2); s.add(2); s.add(3); s.add("hi"); s.add("23");
        System.out.println(s);

        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        SortedSet s2 = new TreeSet();
        s2.add("bhai"); s2.add("hi"); s2.add("samja"); s2.add("ab");
        System.out.println(s2);
    }
}
