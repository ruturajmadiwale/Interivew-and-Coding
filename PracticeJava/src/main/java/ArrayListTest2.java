import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest2 {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("hello"); l1.add("friends"); l1.add("welcome");

        ListIterator<String> list = l1.listIterator();

        while (list.hasPrevious()) {
            System.out.println(list.previous());
        }

    }

}
